public enum WildAnimal {
    MONKEY("bananas", 10),
    ELEPHANT("raspberries", 300),
    GIRAFFE("apples", 40),
    RACCOON("walnuts", 50);

    private final String food;
    private final int amount;

    WildAnimal(String food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public static String listAllAnimals() {

        StringBuilder sb = new StringBuilder("");
        for(WildAnimal animal: WildAnimal.values()) {
            sb.append(animal.ordinal() + 1).append(":");
            sb.append(animal.name() + " would like to eat " + animal.amount * 7 + " " + animal.food);
            sb.append(" a week.\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return this.name() + " eats: " + this.amount + " " + this.food + " a day.";
    }
}
