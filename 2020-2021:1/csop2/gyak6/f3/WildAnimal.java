public enum WildAnimal {
    MONKEY("bananas", 6),
    ELEPHANT("raspberries", 80),
    GIRAFFE("apples", 20),
    RACCOON("walnuts", 30);

    private final String food;
    private final int amount;

    WildAnimal(String food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public String listAllAnimals() {
        StringBuilder sb = new StringBuilder("");
        for(WildAnimal animal: WildAnimal.values()) {
            sb.append(animal.ordinal() + 1).append(": ");
            sb.append(animal.name()).append(" would like to eat ");
            sb.append(animal.amount * 7).append(" " + animal.food + " a week.\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.name() + " eats: " + this.food; 
    }

}