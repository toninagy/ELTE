# Programozási nyelvek (BSc, 18) Java gyakorló feladatok


### 1. feladat

Írjunk egy generikus <code>Stack</code> interfészt, amely a következő műveleteket foglalja magában:  
  • <code>empty</code>: egy <code>boolean</code> értékben visszaadja, üres-e a stack,  
  • <code>push</code>: a paraméterként kapott elemet beleteszi a verembe,  
  • <code>pop</code>: visszaadja és egyben eltávolitja a veremben legutoljára eltárolt elemet. 

Írjunk egy generikus <code>ArrayStack</code> osztályt, ami egy tömbbel valósitja meg az előbb írt
<code>Stack</code> interfészt!

Ehhez két privát adattagra van szükség:  
  • egy tömbre, ami az elemeket tárolja, és  
  • egy <code>int</code> típusú <code>n</code> változóra, ami az épp benne lévő elemek számát adja meg.  

A tömb allokált mérete mindig <code>>= n</code>.

Ezek után a veremhez úgy adunk hozzá új elemet (<code>push</code>), hogy a tömbben a legutóbb hozzáadott 
elem mögé rakjuk, és megnöveljük az <code>n</code> verem-méretet. Kivételkor (<code>pop</code>) a legutóbb 
hozzáadott elemet adjuk vissza, és csökkentjük a verem-méretet. Ha üres veremből próbálnánk meg elemet 
kivenni, dobjunk <code>java.util.NoSuchElementException</code>-t.

Az adatokat tároló tömb mérete változzon dinamikusan a belerakott elemek számától függően! Amikor megtelik 
az aktuálisan allokált tömb, akkor hozzunk létre egy kétszer akkorát, és másoljuk át az elemeket abba. 
Amikor az elemek száma a kapacitás negyedére csökken, akkor pedig másoljunk át mindent egy feleakkora tömbbe. 
Így teljesül az az invariáns, hogy a tömb mindig 25% és 100% közti mértékben van tele.

A <code>main</code> függvényben próbáljuk ki a megírt műveleteket.

Írjunk dokumentációt az osztályhoz, és generáljunk belőle HTML oldalakat 
<code>javadoc</code> segítségével!

Írjunk unit teszteket a Junit könyvtár segítségével!


### 2. feladat

Szeretnénk, ha az <code>ArrayStack</code>-ben tárolt elemeken végig tudnánk iterálni a kényelmes 
<code>for-each</code> ciklussal az alábbi módon:

~~~{.java}
// stack: ArrayStack<int>
for (int num: stack)
  System.out.println(num);
~~~

Terjesszük ki az osztályt úgy, hogy implementálja az <code>Iterable</code> interfészt! Ehhez meg kell 
írnunk az <code>Iterator<T> iterator()</code> szignatúrájú metódust, melyben egy olyan új típusú objektumot 
adunk vissza, amely a verem absztrakciónak megfelelő sorrendben iterál végig az eltárolt elemeken (azaz 
a legutóbb eltárolt elemet adja vissza elsőként, az eggyel korábban eltárolt elemet másodikként, stb.). 
Nevezzük ezt az új típust <code>ReverseArrayIterator</code>-nek, és írjuk meg privát alosztályként! 
A <code>ReverseArrayIterator</code> maga az <code>Iterator</code> interfészt implementálja, azaz az 
alábbi metódusokat kell megírnunk:
<code>hasNext</code>, ami egy <code>boolean</code> értékben visszaadja, hogy vannak-e még további elemek 
a veremben,
<code>next</code>, ami visszaadja a következő elemet, vagy <code>java.util.NoSuchElementException</code>-t 
dob, ha nincs több elem a veremben.

**a)** Próbáljuk ki az új <code>for-each</code> ciklusunkat a <code>main</code>-ben azzal, hogy feltöltjük a 
vermet, és kiírjuk a konzolra az elemeit!

**b)** Írjuk át az a) feladatot úgy, hogy a <code>forEach</code> metódust hívjuk meg a vermen egy lambda kifejezés 
argumentummal! Alakítsuk át úgy, hogy csak a páratlan elemeket írja ki! 

Terjesszük ki a dokumentációt és a unit teszteket az új funkciókra is!


### 3. feladat

Írjunk egy generikus <code>Queue</code> interfészt, ami a következő műveleteket foglalja magában:   
  • <code>empty</code>: <code>boolean</code> értékkel jelzi, üres-e a sor,  
  • <code>enqueue</code> (gyakran <code>push</code> vagy <code>add</code> néven szerepel): új elemet ad 
  hozzá a sorhoz,  
  • <code>dequeue</code> (vagy <code>pop</code>, <code>remove</code>): visszaadja a legrégebben hozzáadott 
  elemet, egyben eltávolítja a sorból.  


Írjunk egy generikus <code>LinkedQueue</code> osztályt, ami láncolt listával valósítja meg a 
<code>Queue</code> interfészt!

Ehhez szükségünk lesz az alábbi privát alosztályra:

~~~{.java}
private class Node<T> {
  T item;
  Node<T> next;
}
~~~

Az lista így definiált csúcsok láncolatából fog állni oly módon, hogy a <code>next</code> mező mindig a következő 
csúcsra mutató referenciát tárol. A legutolsó elem <code>next</code> mezője <code>null</code>. A lista első eleme 
(fejelem vagy <code>head</code>) biztosítja a hozzáférést a teljes listához.

Egy sor megvalósításához úgy kell eltárolnunk a kapott elemeket, hogy mindig könnyen vissza tudjuk adni 
a legrégebben eltároltat. Ez teljesül akkor, ha az új elemeket mindig a lista végére szúrjuk be, 
visszakéréskor pedig a lista elejéről törlünk. Azért, hogy új elemek hozzáadásakor ne kelljen mindig 
végigiterálni az egész listán, eltároljuk és up-to-date tartjuk a fejelem mellett a legutolsó elemre 
mutató referenciát is (<code>tail</code>).

Írjuk meg a <code>Queue</code> interfészben deklarált műveleteket! Üres sorból való elem-kivételkor 
dobjunk <code>java.util.NoSuchElementException</code>-t.

A <code>main</code> függvényben próbáljuk ki a megírt műveleteket.

Írjunk dokumentációt az osztályhoz, és generáljunk belőle HTML oldalakat 
<code>javadoc</code> segítségével!

Írjunk unit teszteket a Junit könyvtár segítségével!


### 4. feladat

Terjesszük ki ezt az osztályt is úgy, hogy végig lehessen rajta iterálni <code>for-each</code> ciklussal! 
(Instrukciókért lásd a 3. feladatot.)

**a)** Próbáljuk ki az új <code>for-each</code> ciklusunkat a <code>main</code>-ben azzal, hogy feltöltjük a 
sort, és kiírjuk a konzolra az elemeit!

**b)** Írjuk át az a) feladatot úgy, hogy a <code>forEach</code> metódust hívjuk meg a soron egy lambda kifejezés 
argumentummal! Alakítsuk át úgy, hogy csak a páros elemeket írja ki! 

Terjesszük ki a dokumentációt és a unit teszteket az új funkciókra is!



### 5. feladat

Használjuk fel az <code>ArrayStack</code> osztályunkat szabályos zárójelezés ellenőrzésére! Írjunk egy 
<code>BalancedParens</code> osztályt, melynek az <code>areBalancedParens</code> osztályszintű metódusa 
egy stringet vár, amelyről eldönti, hogy szabályos zárójelezést ír-e le. A kapott string gömbölyű, 
szögletes és kapcsos zárójelek sorozatából áll, más nem fordul elő benne. A string szabályos zárójelezést 
ír le, ha:  
  1. A kinyitott zárójelek ugyanolyan típusú zárójellel vannak bezárva.  
  2. A kinyitott zárójelek megfelelő sorrendben vannak bezárva.  

Példák:
~~~{.java}
areBalanced("()")     == true
areBalanced("()[]{}") == true
areBalanced("(]")     == false
areBalanced("([)]")   == false
areBalanced("{[]}")   == true
~~~

Teszteljük le az <code>areBalancedParens</code> metódust a <code>main</code> függvényben vagy a 
Junit könyvtár segítségével!


### 6. feladat

Írjunk egy generikus <code>LinkedStack</code> osztályt, ami láncolt listával valósítja meg a 
<code>Stack</code> interfészt!


### 7. feladat

Állítsuk a <code>LinkedQueue</code> osztályunkat a közösség szolgálatába a koronavírus elleni 
harcban!

Írjunk egy <code>QueueFilter</code> programot, ami két parancssori argumentumot vár: egy 
fájlnevet, ami a bolt előtt várakozó személyek adatait tartalmazza, és egy egész számot, ami
azt mondja meg, épp hány óra van. Egy példa bemeneti fájl:

```
Joe 23 1
Janet 55 0
Murphy 72 1
Sid 49 1
Norman 65 0
Jolene 73 0
Jim 19 0
Mark 32 1
```

Minden sor egy személyt ír le. Az első adat a sorban a személy neve, a második a kora, a
harmadik pedig egy <code>boolean</code> érték: <code>1</code>, ha az illető visel maszkot, 
<code>0</code>, ha nem. Az adatokat space karakter választja el egymástól.

A <code>QueueFilter</code> program beolvassa a fenti adatokat egy <code>Person</code> típusú
(mi írjuk meg) objektumokat tartalmazó <code>LinkedQueue</code> sorba, majd kiírja, hogy az
adott időpillanatban kik mehetnek be a boltba (eredeti sorrendben):

```
$ java QueueFilter persons.txt 8
Allowed in the shop:                                                                      
Joe                                                                                       
Sid
Mark
```

Ezt úgy tesszük meg, hogy a beolvasás után kapott sort és az aktuális időpontot odaadjuk egy
<code>sendPeopleHome</code> metódusnak, amely kitöröl a sorból személyeket az alábbi kritériumok
alapján:

- ha kevesebb az óra, mint 9, vagy több, mint 12, akkor azokat a személyeket, akik legalább 65 
évesek,  
- egyébként a 65 évnél fiatalabbakat, valamint
- akin nincs maszk, azt mindenképp törli, kortól és időponttól függetlenül.

Az időpont (óra) értéket 6 és 22 között tekintjük érvényesnek.

Ahhoz, hogy tudjunk törölni a sorból, egészítsük ki a <code>LinkedQueue</code> osztályunkat egy
<code>removeIf</code> metódussal! Kapjon paraméterül egy `Predicate<T> filter` objektumot, amit
importáljunk be a <code>java.util.function</code> könyvtárból! A <code>filter</code> változó egy 
olyan egyparaméteres függvényt reprezentál, aminek <code>boolean</code> típusú a visszatérési értéke.
Hívjuk meg úgy a <code>removeIf</code> metódust, hogy egy adott személy adataira vonatkozó predikátumot
adunk át neki lambda kifejezés formájában!

Ami a <code>removeIf</code> metódus implementációját illeti, a feladatunk az, hogy végigfussunk a sort
megvalósító láncolt listán, és minden olyan csúcsot kitöröljünk, amikre a <code>filter</code> predikátum
igazat ad. Ezt úgy tudjuk letesztelni, hogy a <code>filter</code> objektum <code>test</code> metódusát 
meghívjuk egy <code>Person</code> tipusú objektummal, pl.

```
if (filter.test(node.item)) ...
```
Egy láncolt csúcs törlése annyiból áll, hogy a megelőző csúcs <code>next</code> referenciáját átállítjuk
a következő csúcsra. Figyeljünk a sor két szélére!


### 8. feladat

Írjunk egy generikus <code>ArrayQueue</code> osztályt, ami dinamikusan átméreteződő tömbbel valósítja 
meg a <code>Queue</code> interfészt!

