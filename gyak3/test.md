## Feladat

Készítsetek egy __Temperature__ osztályt a következő szempontok alapján:

Legyen két mezője (field-je): 

- egy egész típusú __currentTemp__
- egy logikai típusú __isFreezing__

Írjátok meg az osztály konstruktorát, amely beállítja a paraméterül megkapott két értéket (int és Boolean (!)) a fenti változók értékeivé, az alábbi két szempontot figyelembe véve:

- Dobjon kivételt a metódus olyan esetben, ha a __currentTemp__ értéke nagyobb, mint 0 és az __isFreezing__ igazat kap, vagy fordítva! (Nem szükséges lekezelni a kivételt.)
- Ha __null__ értéket kap a fagyást megállapító paraméterhez, akkor a fenti logika alapján állítsa azt be _True_-ra vagy _False_-ra.

Írjátok meg a konstruktor túlterhelt változatát, amely __csak a hőmérsékletet__ kapja meg és meghívja a fentebb definiált konstruktort __null__-al az __isFreezing__ paraméterhez.

Készítsetek __getCurrentTemp__ elnevezésű metódust, ami a következő reprezentációval adja vissza a hőmérsékletet: __The current temperature is x degrees Celsius__, ahol x az objektumunk __currentTemp__ értéke.

_Az információelrejtés elvét és a Java konvencionális elnevezési szabályait tartsátok be!_ 



## + Feladat

####Soroljatok fel legalább két okot, hogy miért _érdemes_ / _előnyös_ az *egységbezárás* (információelrejtés vagy enkapszuláció) elvét betartani __getter__, ill. __setter__ használat által.



Munkaidő: 15 perc