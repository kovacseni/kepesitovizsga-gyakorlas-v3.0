# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd!
Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! A `pom.xml` tartalmát nyugodtan át lehet másolni.
Projekt, könyvtár, repository neve legyen: `kepesitovizsga-gyakorlas-v3.0`.
GroupId: `training`, artifactId: `kepesitovizsga-gyakorlas-v3.0`. Csomagnév: `hu.nive.ujratervezes.kepesitovizsga`.

A feladatok megoldásához ajánlom figyelmedbe a cheet sheetet:

https://github.com/Training360/strukturavalto-java-public/blob/master/cheet-sheet/cheet-sheet.md

Először másold át magadhoz a teszteseteket, majd commitolj azonnal!

A három (de ötnek számító) feladatra 3 órád van összesen!

Oldd meg a feladatokat, minden feladat megoldását egy külön commitban
add be!
Ha letelik az idő az első commitodhoz képest és nem fejezted be, megint commitolj, akkor is,
ha nem vagy kész! Utána nyugodtan folytathatod a megoldást, akár több órát is
ülhetsz felette, ha kész vagy, commitolj!

## Nagybetűk

Az UpperCaseLetters osztályban a characters.txt fájl felhasználásával írd meg a `getNumberOfUpperCase(String filename)`
metódust, ami visszaadja a fájlban található mindenféle karakterek közül a nagybetűk számát!

(A characters.txt az `src/main/resources` könyvtárban található.)

## Katicák

Ebben a feladatban a Magyarországon előforduló katicafajtákkal ismerkedhetsz meg. Minden katicának az adatbázisban van egy
magyar neve, egy latin neve, egy nemzetsége, amelyhez rendszertanilag tartozik, valamint tudjuk a pöttyeinek a számát. 
A Ladybird osztályban NE tárold el külön adatszerkezetben az adatbázis adatait, hanem metódusonként külön kérdezd le azokat:
- `getLadybirdsWithExactNumberOfPoints(int number)` : paraméterként egy egész számot vár, és visszaadja az ennyi pöttyel
  rendelkező katicák nevét egy String listában.
- `getLadybirdsByNumberOfPoints()` : egy olyan adatszerkezetet ad vissza, amely növekvő sorrendben tartalmazza az egyáltalán
  előforduló pöttyök számát, és azokhoz társítva azt, hogy konkrétan hány katica rendelkezik pontosan ennyi pöttyel.
- `getLadybirdByPartOfLatinNameAndNumberOfPoints(String partOfName, int numberOfPoints)` : egy latinnév-töredék és egy 
  egész szám alapján kikeresi az ezeknek a feltételeknek megfelelő katicákat, és visszaadja őket egy olyan adatszerkezetben,
  amely a katicák minden adatát képes kezelni.
- `getLadybirdStatistics()` : egy adatszerkezetben adja vissza, hogy melyik nemzetséghez hány fajta katica tartozik

(A teszteléshez szükséges SQL utasítások a resources/db/migration/V1__ladybird.sql fájlban találhatóak.)

## A kert fáinak titkos élete

A kertben különböző gyümölcsfák találhatóak: almafa (AppleTree), cseresznyefa (CherryTree) és diófa (WalnutTree). Mivel 
ezek mindegyike fa (Tree), ezért tavasszal mindegyik kirügyezik és lesznek levelei (int leaves, konstruktorban beállítva).
Ezenkívül mindegyikről már kívülről ránézve nyilvánvaló, hogy milyen típusú gyümölcsöt terem (Fruit enum).
A fák mindegyike a napsütéses napok hatására további leveleket növeszt (`int growLeaves(int numberOfSunnyDays)`) és
gyümölcsöt érlel (`void ripenFruit(int numberOfSunnyDays)`). A levelek a következőek szerint növekednek: az almafának
minden egyes napsütéses napon 10, a cseresznyefának 20, a diófának pedig 30 levele nő. A gyümölcsök pedig csak akkor
tudnak megérni, ha a fának előbb elegendő levele nőtt, de ebben az esetben az almafán annyi kg gyümölcs terem, mint a
levelek számának 50-ed része, a cseresznyén ugyanez az arányszám 30, a diófán 10.
Végül pedig a fák más módon is részt vesznek a kert életében: madárfészkeknek adnak otthont. Méghozzá úgy, hogy minden fán
egységesen 200 levél takar el egy madárfészket. Az `int hostBirdNest()` azt adja vissza, hogy egy-egy fán összesen hány
fészek fér el.