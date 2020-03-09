```java
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car(150,1500);
        Car c2;
        Car c3 = new Car(50, 900);
        c2 = c3;
        // Stack és heap állapota (2)
        c3 = c1 = null;
        System.gc(); // !! Invokáljuk a szemétgyűjtőt 
        // Stack és heap állapota (3)
        // Mit szabad begyűjtenie ezen a ponton a GC-nek?
        // SOME FURTHER CODE
    }
}
class Car {
    private int horsePower;
    private int weight;

    Car(int hp, int w) {
        horsePower = hp;
        weight = w;
        // Stack és heap állapota (1)
    }
}
```

##1. Feladat

Rajzoljátok fel a __Stack__ (végrehajtási verem) és a __Heap__ memória állapotát az *(1), (2) és (3)* pontokon a fenti kódban.

##2. Feladat

Mit szabad begyűjtenie a __main__ metódus *System.gc()* utasítása __után__ a Garbage Collectornak?

## + Feladat

Mit tudtok a __nem ellenőrzött__ kivételekről? (unchecked exceptions)



Munkaidő: 15 perc 