# Programozási nyelvek (BSc, 18) Java 10. gyakorlat


### 1. kérdés

Milyen megkötés van a <code>super</code> kulcsszó használatára a konstruktorban?

- Csak a szülő konstruktorában használható.
- Csak egy gyermekosztály használhatja.
- A konstruktor legutolsó utasításának kell lennie.
- [helyes] A konstruktor legelső utasításának kell lennie.

### 2. kérdés

A <code>Parrot</code> osztály a <code>Bird</code> osztály leszármazottja. Mindkettőnek van
egy <code>greeting()</code> metódusa, ami a madaraknál csiripelést ír ki a konzolra, a
papagájoknál azt, hogy "Jó napot!".

~~~{.java}
Bird harry = new Parrot();
harry.greeting();
~~~

Harry madár csiripelni fog, vagy jó napot kívánni?

- Csiripelni, mert a <code>harry</code> változó típusa <code>Bird</code>.
- [helyes] Jó napot kívánni, mert a <code>harry</code> által referált objektum típusa <code>Parrot</code>.
- Az a <code>greeting()</code> metódus hívódik meg, ami a legközelebb van a forráskódban a híváshoz.
- Egyik sem: az értékadás hibás.

### 3. kérdés

Tegyük fel, hogy a <code>Ragcsalo</code> osztálynak gyermekosztályai az <code>Eger</code> és a 
<code>Patkany</code> osztályok, az <code>Eger</code> osztálynak pedig gyermekosztálya a
<code>TorpeUgroEger</code>. A következő tömb deklarációk közül melyik helyes egy olyan tömb
létrehozására, amelyben <code>Patkany</code> és <code>TorpeUgroEger</code> típusú objektumokat
fogunk tárolni?

- <code>TorpeUgroEger[] tomb = new TorpeUgroEger[10];</code>
- <code>Ragcsalo[] tomb = new TorpeUgroEger[10];</code>
- [helyes] <code>Ragcsalo[] tomb = new Ragcsalo[10];</code>
- <code>Ragcsalo[10] tomb;</code>

### 4. kérdés

Mit jelent, hogy egy kivétel "nem ellenőrzött" (unchecked)?

- A futtató rendszer lekezeli.
- [helyes] Nem kötelező throws-ban deklarálni, ha felléphet.
- A fordító nem ellenőrzi, hogy szintaktikusan helyes.
- Nem ellenőrzi a futtató környezet, hogy felléphet-e.

### 5. kérdés

Mit ír ki az alábbi programrészlet a standard output-ra?

```{.java}
String s = null;
try {
    System.out.print("1");
    s.length();
    System.out.print("2"); }
catch (NullPointerException e) { System.out.print("3"); }
catch (Exception e) { System.out.print("4"); }
```

- 1
- 12
- [helyes] 13
- 123

### 6. kérdés

Mit ír ki az alábbi kódrészlet?

```{.java}
for (int a = 10; a <= 20; ++a) {
    if (a % 3 == 0) a++; else if (a % 2 == 0) a = a * 2;
    System.out.print(a + " ");
}
```

- 11 13 15 17 19

- [helyes] 20

- 11 14 17 20

- 20 40

### 7. kérdés

  Mi NEM jellemző a csomagok esetében használt elnevezési konvencióra?

  - A teljesen minősített név tartalmazza a csomag nevét és az osztály nevét.
  - [helyes] A csomagneveknek nagybetűvel kell kezdődniük.
  - A csomagnevek globális szinten egyediek.
  - A csomagnevek hierarchikus névterekbe szervezhetők.

### 8. kérdés

  Az alábbiak közül melyik lehet (szabályos) konstruktora a WrittenExam nevű osztálynak?

  - void WrittenExam(int x) {}
  - public new(int x) {this.x = x;}
  - [helyes] WrittenExam(String str, int x) {}
  - public void WrittenExam(int x) {this.x = x;}

### 9. kérdés

  A 4. sorban létrehozott Business típusú objektum mikor szabadítható fel legkorábban a szemétgyűjtő által?

  ~~~{.java}
  class Business{}
  class Test{
      Business doBusiness(){
          Business b = new Business(); /* 4. sor */
          return b; /* 5. sor */
      }
      public static void main(String args[]){
          Test t = new Test(); /* 8. sor */
          Business newBusiness = t.doBusiness(); /* 9. sor */
          System.out.println("newBusiness");
          newBusiness = new Business(); /* 11. sor */
          System.out.println("finishing"); /* 12. sor */
      }
  }
  ~~~

  - Az 5. sor után, amikor a doBusiness() metódus befejeződik.
  - A 9. sor után.
  - A 12. sor után, amikor a main() metódus befejeződik.
  - [helyes] A 11. sor után.

  