public interface Reversable {
    void reverse();
}


@FunctionalInterface
interface interfaceImpl{
    public static final int a = 5;
    int dosth(int a,int b);
   
    // (a,b) -> {
    //     System.out.println();
    //     //..
    //     return 5;
    // }

    default void reverse() {
       // some impl.
    }
    // static void m() {
    //     //some impl.
    // }
}