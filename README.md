# SchoolEnd

## Inleiding - Opdr 2
In deze opdracht ga je oefenen met wat je tot nu geleerd hebt over beslissingsstructuren en methodes. En het laten uitprinten van een appeltaart recept door je applicatie!

## Opzetten van een nieuw Java project

1. Open IntelliJ op je computer.

2. Kies rechts bovenin voor _New project_.

3. Op het volgende scherm zie je linksboven dat _Java_ blauw geselecteerd is. Daar klik je op _Next_.

4. Op het volgende scherm hoeven we niks te selecteren en kunnen we gewoon op _Next_ klikken.

5. Op het volgende scherm kunnen we een naam meegeven aan het project. Kies altijd een beschrijvende naam die iets zegt over je project zodat je ook weet wat erin staat. Bijvoorbeeld "javaOpdracht1".

6. Klik daarna op 'Finish'.

## Opdrachtbeschrijving

Maak in het nieuwe Java project dat je hebt gemaakt een main klasse en een `public static void main` methode.

We gaan het volgende appeltaart recept uit laten printen door de applicatie:

Ingrediénten:

- 200 gram ongezouten roomboter
- 200 gram witte bastard suiker
- 400 gram zelfrijzend bakmeel
- 1 stuk(s) ei
- 8 gram vanillesuiker
- 1 snuf zout
- 1.5 kilo zoetzure appels
- 75 gram kristal suiker
- 3 theelepels kaneel
- 15 gram paneermeel

Stappen:
- Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)
- Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.
- Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.
- Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.
- Vet de springvorm in en bestrooi deze met bloem
- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.
- Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.
- Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.
- Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken
- Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.

Nou kunnen we dit alles natuurlijk in de main met een System.out.println zetten en dan werkt het. Maar dat is niet wat we gaan doen. We gaan de applicatie netjes opbouwen met de kennis die je tot zo ver hebt opgedaan.

![Appeltaart](./assets/appeltaart.jpg)


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

- minimaal 3 klassen genaamd: `Ingredient`, `ApplePieRecipe` en `Main`
- minimaal 3 variabelen, 2 constructors en getters en setters in `Ingredient`
- minimaal voor elk ingredient dat hierboven genoemd is een object geinstanieerd in `ApplePieRecipe`
- minimaal voor elke stap die hierboven genoemd word een methode die de tekst via een `System.out.println()` uitprint
- minimaal 1 object van het type `ApplePieRecipe` om de tekst uit te kunnen printen in de `Main` klasse


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

1. Maak een nieuw project aan in IntelliJ.

2. Maak een nieuwe klasse aan genaamd  'Main'. Doe dit door met de rechter muisknop op de map 'SRC' te klikken, vervolgens klik je op 'New' en dan op 'Java class'.

3. Maak een `public static void main` methode aan.

4. Maak een nieuwe klasse `Ingredient` aan, dit gaat het framework worden van een ingredient object

5. Maak 3 **private** variabelen aan binnen de klasse, namelijk `amount`, `unit` en `name`. Geef deze de juiste datatypes.

6. Maak een lege constructor aan en een constructor gevuld met alle 3 de variabelen. Zet ook voor alle variabelen zowel een getter als een setter in deze klasse.

7. Maak een nieuwe klasse `ApplePieRecipe` aan, hier gaan we voor elk van de ingredient van `Ingredient` een object instantieren.

8. Maak voor iedere stap een `public void ` methode aan genaamd step1, step2 enz. Zet vervolgens een `System.out.println()` in de body van de methode. En laat deze de tekst van de stap uitprinten.

9. Maar dat is eigenlijk niet zo handig om een methode stap1 te noemen. Want wat doet deze methode? Weet ik dat over 2 jaar nog? Nee, hernoem daarom de methodes op een manier dat de naam wat zegt over wat de methode doet.

10. Maar hoe kunnen we nu deze aanspreken van uit de `Main` klasse? Ja, precies door een object aan te maken van het type `ApplePieRecipe`

11. Roep hiermee van uit de `Main` klasse alle methodes aan  `ApplePieRecipe`, zodat als we de `public static void main` methode laten draaien we alle stappen geprint zien worden.

12. De oplettende student heeft gezien dat we helemaal niets doen met de objecten van `Ingredient`. En dat terwijl we daar zo veel moeite in hebben gestopt. Maar iemand die deze app draait zou ook wel willen weten welke ingredienten nodig zijn voor de recept. Maak daarom een `public void` methode genaamd printIngredients aan in `ApplePieRecipe`. Laat deze methode voor ieder object een `System.out.println("object.getAmount + " " + object.getUnit + " " + object.getName)` uitprinten. (Vervang natuurlijk object met de naam van het object dat je het gegeven bij het instantieren.)

13. Roep ook deze aan vanuit de `Main` methode, zodat eerst de ingredienten een voor een worden geprint gevolgd door elke stap van het recept.

14. Dit is een van de mogelijkheden en is op zich helemaal prima, maar neem ook een kijkje bij de extra opdrachten.

## Extra opdrachten

1. Zou je ook een methode kunnen maken die alle stappen uitprint? Dan hoef je niet alle methode aan te roepen van uit de `Main` klasse. Ziet dat er niet een stuk netter uit?
2. Zou je dit misschien met meer recepten kunenn doen? Probeer zelf een recept toe te voegen en op de zelfde manier uit te voeren als het appeltaart recept.


## Inleiding - Opdr 1
Welkom bij de eerste huiswerkopdracht die jullie gaan maken voor de Backend leerlijn. Je hebt als het goed is de eerste hoofdstukken gelezen en de eerste les van de cursus Java gevolgd. In deze opdracht ga je oefenen met wat je tot nu geleerd hebt over beslissingsstructuren en methodes.

## Opzetten van een nieuw Java project

1. Open IntelliJ op je computer.

2. Kies rechts bovenin voor _New project_.

3. Op het volgende scherm zie je linksboven dat _Java_ blauw geselecteerd is. Daar klik je op _Next_.

4. Op het volgende scherm hoeven we niks te selecteren en kunnen we gewoon op _Next_ klikken.

5. Op het volgende scherm kunnen we een naam meegeven aan het project. Kies altijd een beschrijvende naam die iets zegt over je project zodat je ook weet wat erin staat. Bijvoorbeeld "javaOpdracht1".

6. Klik daarna op 'Finish'. Gefeliciteerd! Je hebt zojuist je eerste project aangemaakt.

## Opdrachtbeschrijving

Maak in het nieuwe Java project dat je hebt gemaakt een BeslissingsstructurenMethodes.Main klasse en een `public static void` BeslissingsstructurenMethodes.Main methode. Maak daarnaast ook de volgende methodes:
- `hello()`
- `positiveOrNegative(int number)`
- `postiveOrZeroOrNegativ(int number)`
- `bartender(String name)`
- `sum(int input1, int input2)`

Maak de volgende variabelen aan in de BeslissingsstructurenMethodes.Main methode:
- `int number`
- `int input1`
- `int input2`
- `String name`

Het gedrag van de methoden is als volgt:
- De `hello`-methode print de regel "Hello, world!";
- De `positiveOrNegative`-methode print aan de hand van een _if else_ statement "This number is positive!" of "This number is negative!";
- De `positiveOrZeroOrNegative`-methode print aan de hand van een _if else if else_ statement "This number is positive!", "This number is zero!" of "This number is - negative!";
- De `bartender`-methode print aan de hand van een _switch_ statement, het drankje dat deze persoon graag drinkt;
- De `sum`-methode print de uitkomst van de twee nummers die bij elkaar zijn opgeteld.

De waarde van `number` is 6.
De waarde van `input1` is 4.
De waarde van `input2` is 20.
De waarde van `name` is Henk.

Roep alle methodes aan vanuit de BeslissingsstructurenMethodes.Main methode, verander de waardes en kijk wat eruit komt als je de waardes aanpast en opnieuw draait.

![Drinks](./assets/drankjes.jpg)


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

- minimaal 4 _variabelen_
- minimaal 5 _methodes_
- 1 _if/else_ statement
- 1 _if/else if/else_ statement
- 1 _switch_ statement


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

1. Maak een nieuw project aan in IntelliJ.

2. Maak een nieuwe klasse aan genaamd  `BeslissingsstructurenMethodes.Main`. Doe dit door met de rechter muisknop op de map `SRC` te klikken, vervolgens klik je op `New` en dan op `Java class`.

3. Maak een `public static void BeslissingsstructurenMethodes.Main` methode aan.

4. Maak in de `public static void BeslissingsstructurenMethodes.Main` methode de variabelen aan die hierboven genoemd zijn met de juiste waarden.

5. Maak na de `}` van de `public static void BeslissingsstructurenMethodes.Main` methode een nieuwe public static void methode met de naam `hello`. Laat deze methode een regel printen door `System.out.println` te gebruiken. Kijk hierboven voor de juiste tekst. Deze methode krijgt geen _variabelen_ mee gestuurd.

6. Roep de `hello` methode aan in de `public static void BeslissingsstructurenMethodes.Main` methode. Laat nu de applicatie draaien door op de play-knop in de goot van IntelliJ te drukken.

7. Maak een `public static void` mehode aan met de naam `positiveOrNegative` en geef deze de juiste _parameters_ mee. Zet in deze methode een _if else_ statement. De voorwaarde van de _if_ is `(number > 0)`. Bij de _if_ moet de methode de tekst: "This number is positive!" printen. Bij de _else_ mag de tekst: "This number is negative!".

8. Roep deze methode aan in de `public static void BeslissingsstructurenMethodes.Main` methode en geef het juiste _argument_ mee. Laat de applicatie weer draaien door op de play-knop te drukken.

9. Verander de waarde van `number` naar -6 en draai de applicatie opnieuw. Wat is er nu veranderd? En wat als `number` de waarde 0 heeft? Klopt dit?

10. Maak een nieuwe `public static void` methode aan genaamd `positiveOrZeroOrNegative` en geef deze de juiste _attributen_ mee. Plaats in deze methode een _if else if else_ statement. Deze lijkt veel op de _if else_ statement van de `positiveOrNegative` methode, echter staat er tussen de _if_ en de _else_ nog een _else if_ met de volgende voorwaarde: `(number == 0) {System.out.println("This number is zero!}`.

11. Roep ook deze methode aan vanuit de `public static void BeslissingsstructurenMethodes.Main` methode en geef ook hier de juiste _argument_ aan mee.

12. Maak een nieuwe `public static void` methode genaamd `bartender` en geef deze de juiste _parameter_ mee. Gebruik in deze methode de _switch_ methode om aan de hand van de `string name` het drankje van verschillende personen te printen.

13. Roep ook deze methode aan vanuit de `public static void BeslissingsstructurenMethodes.Main` methode en speel met verschillende namen die je in de _ switch_ cases hebt gezet.

14. Maak nog een `public static void` methode aan genaamd `sum` en geef deze de juiste _parameters_ mee. Laat deze methode de volgende tekst printen: "input1 summed by input2 = 24".

15. Roep deze methode ook aan in de `public static void BeslissingsstructurenMethodes.Main` methode en speel met verschillende waardes.