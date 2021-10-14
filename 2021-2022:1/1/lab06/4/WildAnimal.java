public enum WildAnimal {
    MONKEY("bananas", 10),
    ELEPHANT("raspberries", 500),
    GIRAFFE("apples", 40),
    RACCOON("walnuts", 100);

    private String fruit;
    private int amount;
    
    WildAnimal(String fruit, int amount) {
        this.fruit = fruit;
        this.amount = amount;
    }

    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();
        for(WildAnimal animal : WildAnimal.values()) {
            sb.append(animal.ordinal() + 1).append(":");
            sb.append(animal.name()).append(" desires eating ").append(animal.amount * 7).append(" ");
            sb.append(animal.fruit).append(" a week.\n");
        }
        return sb.toString();
    }

    @Override 
    public String toString() {
        return "A(n) " + this.name() + " eats " + this.amount + " " + this.fruit + " a day.";
    }
}
