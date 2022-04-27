public interface Reversable {
    private static void privateMethod() {
        //business logic
    }
    public default void someDefaultMethod() {
        privateMethod();
        //some logic
    }
    void reverse();
}
