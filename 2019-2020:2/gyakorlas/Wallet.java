package tv;

public class Wallet {

    private int funds = 0;

    public void topUp(String cardNumber, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        try (CreditCard card = new CreditCard(cardNumber)){
            card.charge(amount);
        } catch (CreditCardException e) {
            throw new RuntimeException("Could not charge Your credit card", e);
        }
        funds += amount;
    }

    public void draw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (amount > funds) {
            throw new InsufficientFundsException("You don't have enough funds in Your Wallet, You need at least "
                    + amount + " USD");
        }
        funds -= amount;
    }

}

