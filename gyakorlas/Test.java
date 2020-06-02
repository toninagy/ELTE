package test;

import tv.*;
import tv.providers.ChannelFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Consumer;

import static test.Assertions.*;

public final class Test implements AutoCloseable {

    public static void main(String[] args) {
        Test.runAllTests();
    }

    public static void runAllTests() {
        runTest(Test::testCreditCard, "Credit Card");
        runTest(Test::testWallet, "Wallet");
        runTest(Test::testShow, "Show");
        runTest(Test::testChannel, "Show");
        runTest(Test::testSearch, "Show search");
        runTest(Test::testBrowse, "Show browse");
        runTest(Test::testSubscribe, "Subscription");
        runTest(Test::testWatch, "Show watch");
    }

    private void testCreditCard() {
        try (CreditCard c = new CreditCard("1234")) {
            c.charge(100);
        }
        assertThrows("depleted credit card must throw", CreditCardException.class, () -> {
            try (CreditCard c = new CreditCard("1234")) {
                c.charge(1);
            }
        });
        assertThrows("invalid amount must throw", IllegalArgumentException.class, () -> {
            try (CreditCard c = new CreditCard("1234")) {
                c.charge(-1);
            }
        });
        assertThrows("insufficient credit must throw", CreditCardException.class, () -> {
            try (CreditCard c = new CreditCard("1234")) {
                c.charge(101);
            }
        });
        assertThrows("invalid credit card must throw", CreditCardException.class, () ->
                new CreditCard("NA")
        );

    }

    private void testWallet() {
        Wallet w1 = new Wallet();
        w1.topUp("1234", 100);
        Wallet w2 = new Wallet();
        w2.topUp("1212", 200);

        assertThrows("invalid amount must throw", IllegalArgumentException.class, () -> {
            Wallet w = new Wallet();
            w.topUp("1234", 0);
        });
    }

    private void testShow() {
        Show s = new Show("Santa Clarita Diet");
        assertEquals("getter should return the title", "Santa Clarita Diet", s.getTitle());
    }

    private void testChannel() {
        Map<String, List<Show>> predefinedShows = new HashMap<String, List<Show>>() {{
            put("HBO", Arrays.asList(new Show("Game of Thrones"), new Show("Westworld")));
            put("SHOWTIME", Collections.singletonList(new Show("Shameless")));
            put("STARZ", Arrays.asList(new Show("Outlander"), new Show("Battlestar Galactica")));
        }};

        Arrays.stream(ChannelFactory.Provider.values())
                .map(ChannelFactory::getChannel)
                .forEach(c -> {
                    assertThat("channel is valid", c.getName().toUpperCase(), predefinedShows::containsKey);
                    List<Show> shows = predefinedShows.get(c.getName().toUpperCase());
                    assertThat("shows not null", shows, Objects::nonNull);
                    assertThat("channel " + c + " has at least these shows: " + shows, () ->
                            c.getShows().stream()
                                    .allMatch(s1 -> shows.stream()
                                            .anyMatch(s2 -> Objects.equals(s1.getTitle(), s2.getTitle())))
                    );
                });
    }
    
    private void testSearch() {
        try {
            TvApp tvApp = new TvApp(new Wallet());
            TvShow game_of_thrones = tvApp.searchShow("Game of Thrones");
            assertEquals("title must match", game_of_thrones.getTitle(), "Game of Thrones");
        } catch (Throwable t) {
            fail("could existing not find show");
        }
        assertThrows("non-existing show must throw", NoSuchElementException.class, () -> {
            TvApp tvApp = new TvApp(new Wallet());
            tvApp.searchShow("this should not be there");
        });
    }

    private void testBrowse() {
        TvApp tvApp = new TvApp(new Wallet());
        List<TvShow> tvShows = tvApp.browseAllShows();
        assertThat("no channels must be subscribed",
                () -> tvShows.stream().noneMatch(TvShow::isSubscribed));
    }

    private void testSubscribe() {
        {
            Wallet w = new Wallet();
            w.topUp("1234", 100);
            TvApp tvApp = new TvApp(w);

            TvShow game_of_thrones = tvApp.searchShow("Game of Thrones");
            assertEquals("channel must be HBO",
                    "HBO", game_of_thrones.getChannel().getName());
            game_of_thrones.subscribe();
            assertTrue("HBO must be subscribed", game_of_thrones.isSubscribed());

            TvShow westworld = tvApp.searchShow("Westworld");
            assertEquals("channel must be the same for Westworld",
                    "HBO", westworld.getChannel().getName());
            assertTrue("HBO is already subscribed", westworld.isSubscribed());
        }

        {
            TvApp tvApp = new TvApp(new Wallet());
            assertThrows("throw when there are no funds", InsufficientFundsException.class, () ->
                    tvApp.searchShow("Game of Thrones").subscribe());

        }

    }

    private void testWatch() {
        Wallet w = new Wallet();
        w.topUp("1234", 100);
        TvApp tvApp = new TvApp(w);
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            TvShow game_of_thrones = tvApp.searchShow("Game of Thrones");

            assertThrows("cannot watch without subscription", null, () ->
                    game_of_thrones.watch(byteArrayOutputStream));
            assertEquals("output stream not modified", "", byteArrayOutputStream.toString());

            game_of_thrones.subscribe();
            game_of_thrones.watch(byteArrayOutputStream);
            assertEquals("show has been watched", "You are watching Game of Thrones on HBO".toUpperCase(),
                    byteArrayOutputStream.toString().trim().toUpperCase());
        } catch (IOException e) {
            fail("exception thrown: " + e);
        }
    }

    @Override
    public void close() {
        resetCreditCards();
    }

    @SuppressWarnings("unchecked")
    private static void resetCreditCards() {
        try {
            Field available_cards = CreditCard.class.getDeclaredField("AVAILABLE_CARDS");
            available_cards.setAccessible(true);
            Map<String, Integer> map = (Map<String, Integer>) available_cards.get(null);
            map.computeIfPresent("1234", (k, v) -> 100);
            map.computeIfPresent("1212", (k, v) -> 200);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    private static void runTest(Consumer<Test> consumer, String description) {
        try (Test t = new Test()) {
            System.out.println("Running test: " + description);
            consumer.accept(t);
        } catch (AssertionError e) {
            System.err.println(e);
            System.err.println("Test failed: " + description);
        } catch (Throwable t) {
            System.err.println("Unknown exception during test");
            System.err.println(t);
        }
    }
}