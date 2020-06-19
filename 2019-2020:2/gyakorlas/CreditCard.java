package tv;

import java.util.HashMap;
import java.util.Map;

public class CreditCard implements AutoCloseable {

    private static final Map<String, Integer> AVAILABLE_CARDS = new HashMap<>();
    static {
        AVAILABLE_CARDS.put("1234", 100);
        AVAILABLE_CARDS.put("1212", 200);
    }

    private final String cardNumber;
    private Integer balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        balance = AVAILABLE_CARDS.get(cardNumber);
        if (balance == null) {
            throw new CreditCardException("Invalid credit card number");
        }
    }

    public void charge(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (amount > balance) {
            throw new CreditCardException("Your credit card balance is insufficient");
        }
        balance -= amount;
    }

    @Override
    public void close() throws CreditCardException {
        AVAILABLE_CARDS.put(cardNumber, balance);
    }
}

