public enum WildAnimal {
    MONKEY("bananas", 10), 
    ELEPHANT("cherries", 5000), 
    GIRAFFE("apples", 30), 
    RACCOON("walnut", 60);

    private final String food;
    private final int amount;

    WildAnimal(String food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();
        for(WildAnimal animal : WildAnimal.values()) {
            sb.append((animal.ordinal() + 1)).append(": ").append(animal.name());
            sb.append(" would like to eat ").append(animal.amount * 7).append(" ").append(animal.food).append(" a week\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.name() + " would like to eat " + this.amount + " " + this.food + " a day";
    }
}
