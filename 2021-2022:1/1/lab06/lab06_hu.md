# Programozási nyelvek (BSc, 18) Java 6. feladatsor



### 1. feladat

Készítsen egy `IntegerMatrix` nevű osztályt a következő metódusokkal.

Egy konstruktor, mely 3 paramétert vár:

`int rowNum` (A mátrix sorainak száma)  
`int colNum` (A mátrix oszlopainak száma)  
`int[] linearData` (Egy, a mátrix elemeit sorfolytonosan tároló tömb)

Egy `toString()` metódus, mely egyetlen karakterláncba felsorolja a
mátrix elemeit. A karakterláncban az egy sorban szereplő elemeket a `,`
karakterrel válassza el; a sorokat a `;` karakterrel válassza el!

Például `linearData = {1,2,3,4,5,6}` esetén az
`IntegerMatrix(2,3,linearData)` konstruktorhívás hatására a következő mátrix
készül:

```
[1 2 3]
[4 5 6]
```

Ez esetben objektum `toString()` metódusa a következő sztringgel tér vissza:
`"1,2,3;4,5,6"`.

int\[][] matrix = new int\[5][5];

​        for (int[] arr : matrix) {

​            for(int element : arr) {

​				//..logic

​            }

​        }

### 2. feladat

#### a

Módosítsa az **1. feladatsor 7.** feladatának megoldását úgy, hogy az operandusok
`double` típusúak legyenek, valamint az elvégezendő műveletet is parancssori
argumentumként fogadja a program. A program csak a kért típusú alapműveletet
végezze el.

Amennyiben nem megfelelő számú argumentummal hívták meg a programot, akkor
a `main()` függvény dobjon `IllegalArgumentException` kivételt. Nullával való
osztás esetén dobjon `ArithmeticException` kivételt; nem támogatott alapművelet
esetén pedig `IllegalArgumentException` kivételt.

#### b

Módosítsa az előző megoldást úgy, hogy a `main()` függvény kapja el a dobott
kivételeket, és ezek előfordulása esetén általános hibaüzeneteket írjon ki
a képernyőre (például nem megfelelő számú argumentum esetén "Invalid program
arguments provided."). A `parseDouble()` konverziós metódus érvénytelen sztring
esetén `NumberFormatException` kivételt dob; kapja el ezt a kivételt is.

#### c

Módosítsa az előző megoldást úgy, hogy a kivételek konstruálásakor informatív
üzenetet ad át a kivétel konstruktorának; a kivétel kezelésekor írja ki a
kivétel objektumban tárolt üzenetet.

### 3. feladat

Ebben a feladatban a **4. feladatsor 4/b** feladatát érdemes továbbfejleszteni.

#### a

Írjon a `Circle` osztályhoz statikus `readFromFile()` metódust, amely betölti
a paraméterként kapott fájlnevű fájlból egy kör adatait (`x` és `y` koordináta és sugár újsorral elválasztva), megkonstruál ezen adatokkal egy `Circle` objektumot,
majd visszatér az objektum referenciájával. A függvény a fellépő kivételeket
engedje tovább a hívóhoz.

Írjon a `Circle` osztályhoz `saveToFile()` metódust, amely az aktuális `Circle` objektum
adatait a paraméterként megadott fájlnevű fájlba menti. Amennyiben a fájlba írás kivételes
eseménybe ütközik, a függvény engedje tovább a kivételes eseményt a hívóhoz.
Gondoskodjon arról, hogy ha a kiírás menet közben ütközik kivételes eseménybe,
akkor a már kiírt adatok ne vesszenek el (azaz a `Writer` objektumot mindenképpen
be kell zárni).

Próbálja ki mi a különbség ha a hívott függvények kivételeit elkapja illetve nem kapja el a főprogramban.

#### b

Készítse el az **a** megoldás egy olyan változatát, amelyben a `readFromFile()`
metódus megpróbálja kezelni a fellépő kivételes eseményeket: ha valamilyen kivételes
esemény miatt nem sikerül a beolvasás, akkor jöjjön létre kör objektum valamilyen értelmes kezdőértékekkel.

### 4. feladat

Készítse el a `WildAnimal.java` fájlba a `WildAnimal` felsorolási típust (`enum`-ot),
amelyben legyen négy felsorolási tag: majom, elefánt, zsiráf és mosómedve.
Az állatok konstruktorában első paraméternek megkapják azt, hogy melyik gyümölcsöt
szeretik enni, második paraméterként pedig azt, hogy mennyi lenne ideális esetben
egy napi adagjuk az adott gyümölcsből. 

Készítse el a `listAllAnimals()` metódust, amely egy ilyen formátumú szöveggel
tér vissza:

"_A vadállat sorszáma_: _a vadállat neve_ szeretne enni _a vadállat gyümölcse_ egy héten."

Például, ha az elefánt megadott napi mennyisége 30 málna volt:  
"2: Elefánt szeretne enni 210 málnát egy héten."

Az `enum` elemeinek bejárásához használja a `values()`, illetve a sorszám lekérdezéséhez
az `ordinal()` metódust.

Készítsen saját `toString()` metódust, amely az adott `enum` elem által meghívott
állatról írja ki az információkat.

Próbálja ki az elkészített felsorolási típust és a hozzátartozó metódusokat egy
`Main` osztályban.

