package tv;

import tv.providers.ChannelFactory;
import tv.providers.ChannelFactory.Provider;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class TvApp {

    private final Wallet wallet;
    private final Map<Channel, Boolean> channels = new HashMap<>();

    public TvApp(Wallet wallet) {
        this.wallet = wallet;
        for (Provider p : Provider.values()) {
            channels.put(ChannelFactory.getChannel(p), false);
        }
    }

    public List<TvShow> browseAllShows() {
        return channels.keySet().stream()
                .flatMap(c -> c.getShows().stream().map(show -> new TvShowImpl(show.getTitle(), c)))
                .collect(Collectors.toList());
    }

    public TvShow searchShow(String title) {
        return channels.keySet().stream()
                .flatMap(c -> c.getShows().stream().map(show -> new TvShowImpl(show.getTitle(), c)))
                .filter(s -> Objects.equals(s.getTitle(), title))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Show not found"));
    }

    private class TvShowImpl extends Show implements TvShow {

        private final Channel channel;

        TvShowImpl(String title, Channel channel) {
            super(title);
            this.channel = channel;
        }

        public void watch(OutputStream outputStream) throws UnSubscribedShowException {
            if (!channels.get(getChannel())) {
                throw new UnSubscribedShowException("You need to subscribe to the channel " + getChannel().getName()
                        + " to watch this show");
            }
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println("You are watching " + this + " on " + channel);
            printWriter.flush();
        }

        public boolean isSubscribed() {
            return channels.get(getChannel());
        }

        public void subscribe() throws InsufficientFundsException {
            if (channels.get(getChannel())) return;
            wallet.draw(getChannel().getPrice());
            channels.put(getChannel(), true);
        }

        public Channel getChannel() {
            return channel;
        }
    }
}
