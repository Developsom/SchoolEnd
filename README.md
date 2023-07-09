# SchoolEnd

## Inleiding - Opdr 6

Je hebt geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. Ook weet je nu meer over: access modifiers, keywords, overloading, klassen, methoden en nog veel meer. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. In deze opdracht passen wij de scope, overloading, keywords en interfaces toe op Pokémons!

## Opdrachtbeschrijving

Je gaat een applicatie programmeren waarmee een speler via de commandline een spel kan spelen. Degenen die bekend zijn met Pokémon weten
dat deze altijd een _type_ hebben (sterker nog: Pokémon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokémon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡. Daarnaast gaan we een gym maken en een trainer, zodat de applicatie interactief kan worden.

Naast hun type, hebben Pokémon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
**super** klasse. Ook gaan we kijken naar overloading, polymorfisme en een interface.


![Pokemon!](./assets/pokemon.JPG)


### Afwijking van werkwijze

Omdat jullie inmiddels wat verder gevorderd zijn met het programmeren met
`Java` gaan we jullie laten ervaren hoe het is om samen een
applicatie in elkaar te zetten. Jullie krijgen daarom een deel van de code van
ons. Jullie krijgen de Main klasse en de PokemonGym klasse.
Deze twee klassen hoeven jullie niet meer aan te passen.
Ze staan echter wel vol met foutmeldingen. Deze foutmeldingen mogen jullie weg werken
door klassen, methodes, variabelen, abstracte klassen en interfaces te maken (en soms een import).
De code in de PokemonGym fungeert als een soort van "game engine". Deze code hoef je niet te begrijpen, maar het is leuk om te bestuderen.
De Methodes en Variabelen klassen bevatten hints voor deze opdracht en zullen verder
geen deel uitmaken van de uiteindelijke applicatie.

#### Klassen naamgeving

Omdat we de belangrijkste functionaliteit al voor je hebben uitgewerkt, is het belangrijk dat je jouw
klassen de juiste namen geeft. Kijk daarom goed in [Methodes.java](./src/Methodes.java), [Main.java](./src/Main.java) en [PokemonGymImpl.java](./src/PokemonGymImpl.java).
Daar worden alle klassenamen gebruikt.
Door de methodes in [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java)
goed te lezen, kun je voor de meeste methodes en variabelen al afleiden in welke klassen die moeten komen te staan.

#### Methodes en variabelen verdelen

In deze opdracht hoef je zelf geen methodes of variabelen te bedenken. (Tenminste, niet totdat je aan de bonusopdrachten gaat werken.)
We hebben bijna alle methodes al voor je in [Methodes.java](./src/Methodes.java) gezet, behalve getters en setters.
De methodes die hier niet staan, waaronder constructors, kun je afleiden uit [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java).
We hebben een aantal variabelen die je nodig hebt, beschreven in [Variabelen.java](./src/Variabelen.java),
maar je kunt ze ook afleiden uit de getters, setters en constructors die in [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java) worden aangeroepen.
Het enige wat je nog moet doen is de methodes en variabelen in de juiste klasse(n) zetten.
De variabelen uit [Variabelen.java](./src/Variabelen.java) moet je meestal nog een type geven en instantiëren, maar bij sommigen hebben we dat ook al gedaan.

### De aanval methodes

De aanval methodes moeten de volgende eigenschappen hebben:
- een `system.out.println` die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
- een beslissingsstructuur die kijkt welk type de vijand heeft;
- aan de hand van de beslissingsstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
- een `system.out.println` die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
- vergeet de hp van de vijand niet te verlagen;
- sluit de methode af met een `system.out.println` die de resteren hp waarde weergeeft van de vijand;

De volgende methodes hebben nog een extra functie:
- `rainDance` heeft geen effect op electric Pokemons maar geeft een `system.out.println` met de boodschap: "has no effect on (vijand)";
- `rainDance` levert een hp boost aan vijanden grass-types;
- `thunder` levert een hp boost aan electric Pokemons;
- `leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;


### Spel logica

Bij Pokémons is het zo dat het type bepalend is voor hoe zwaar de schade is. Hieronder vind je een overzichtje voor een logica van schade bij aanvallen:
- Het type fire🔥 doet de meeste schade aan grass-pokémons🌿, daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.
- Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥, dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.
- Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿, dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.
- Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡, dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Je mag geen code toevoegen, aanpassen of verwijderen uit de `Main` en `PokemonGymImpl` klassen, behalve de nodige imports.
- Een `abstract` super klasse  met 5 `private` `final`  variabelen,  1 `private`variabele, 1 constructor, 6 getters en 1 setter;
- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2 `private` `final` variabelen, 1 constructor, 4 methodes, 1 getter bevatten;
- Een `Main`-klasse met een `main`-methode;
- Een `interface` met 11 methodes;
- Een implementatie (-Impl) van de `interface` waarin alle methodes worden overschreven met een `@Override`;
- 2 "normale" klassen. Waarvan een klasse met 8 variabelen, constructor, getters en setters. De andere klasse extends de eerste klasse en heeft zelf nog 1 variabele, een getter, setter en een constructor die enkel de super aanroept.


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. Loop door [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java) en los alle foutmeldingen op door klassens, variabelen en methodes aan te maken en af en toe iets te importeren.
2. Kijk in [Variabelen.java](./src/Variabelen.java) of daar nog niet-geimplementeerde variabelen staan. Plaats deze in de juiste klassen, die je zojuist hebt aangemaakt en geef ze de juiste datatypen.
3. Geef alle variabelen getters en setters als ze in de juiste klasse staan.
4. Doe hetzelfde voor [Methodes.java](./src/Methodes.java).
5. Implementeer de aanval methodes zoals hierboven beschreven. Let daarbij ook op de bijzondere gevallen `raindance`, `thunder` en `leechSeed`.
6. Plaats de methodes in de interface plaatsen zonder uitwerking. Dus alleen het returntype, naam, datatypes van de parameters en de parameters van de methode.


## Bonusopdrachten

1. Voeg de variabele ‘food’ met het juiste datatype toe aan de juiste klasse(n). Voeg ook een methode toe waarbij de hp van de Pokémon een boost krijgt wanneer hij gevoerd wordt.
2. Pas het spel aan zodat je het pokémonvoedsel naar de Pokémon gooit voor een aanval, in plaats van een aanval doet. Als dit voedsel het juiste type is voor dit type Pokémon, zal het de Pokémon een boost geven.
3. Op dit moment kun je het spel oneindig spelen. Pas het spel aan zodat een Pokémon die geen hp meer heeft, niet meer gebruikt kan worden, tenzij het spel opnieuw wordt opgestart.


## Tip

Let goed op welke tips en advies IntelliJ je geeft!


## Inleiding - Opdr 5

Je hebt geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. Ook weet je nu meer over: access modifiers, keywords, overloading, klassen, methoden en nog veel meer. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. In deze opdracht passen wij de scope, overloading, keywords en interfaces toe op Pokémons!

## Opdrachtbeschrijving

Je gaat een applicatie programmeren waarmee een speler via de commandline een spel kan spelen. Degenen die bekend zijn met Pokémon weten
dat deze altijd een _type_ hebben (sterker nog: Pokémon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokémon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡. Daarnaast gaan we een gym maken en een trainer, zodat de applicatie interactief kan worden.

Naast hun type, hebben Pokémon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
**super** klasse. Ook gaan we kijken naar overloading, polymorfisme en een interface.


![Pokemon!](./assets/pokemon.JPG)


### Afwijking van werkwijze

Omdat jullie inmiddels wat verder gevorderd zijn met het programmeren met
`Java` gaan we jullie laten ervaren hoe het is om samen een
applicatie in elkaar te zetten. Jullie krijgen daarom een deel van de code van
ons. Jullie krijgen de Main klasse en de PokemonGym klasse.
Deze twee klassen hoeven jullie niet meer aan te passen.
Ze staan echter wel vol met foutmeldingen. Deze foutmeldingen mogen jullie weg werken
door klassen, methodes, variabelen, abstracte klassen en interfaces te maken (en soms een import).
De code in de PokemonGym fungeert als een soort van "game engine". Deze code hoef je niet te begrijpen, maar het is leuk om te bestuderen.
De Methodes en Variabelen klassen bevatten hints voor deze opdracht en zullen verder
geen deel uitmaken van de uiteindelijke applicatie.

#### Klassen naamgeving

Omdat we de belangrijkste functionaliteit al voor je hebben uitgewerkt, is het belangrijk dat je jouw
klassen de juiste namen geeft. Kijk daarom goed in [Methodes.java](./src/Methodes.java), [Main.java](./src/Main.java) en [PokemonGymImpl.java](./src/PokemonGymImpl.java).
Daar worden alle klassenamen gebruikt.
Door de methodes in [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java)
goed te lezen, kun je voor de meeste methodes en variabelen al afleiden in welke klassen die moeten komen te staan.

#### Methodes en variabelen verdelen

In deze opdracht hoef je zelf geen methodes of variabelen te bedenken. (Tenminste, niet totdat je aan de bonusopdrachten gaat werken.)
We hebben bijna alle methodes al voor je in [Methodes.java](./src/Methodes.java) gezet, behalve getters en setters.
De methodes die hier niet staan, waaronder constructors, kun je afleiden uit [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java).
We hebben een aantal variabelen die je nodig hebt, beschreven in [Variabelen.java](./src/Variabelen.java),
maar je kunt ze ook afleiden uit de getters, setters en constructors die in [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java) worden aangeroepen.
Het enige wat je nog moet doen is de methodes en variabelen in de juiste klasse(n) zetten.
De variabelen uit [Variabelen.java](./src/Variabelen.java) moet je meestal nog een type geven en instantiëren, maar bij sommigen hebben we dat ook al gedaan.

### De aanval methodes

De aanval methodes moeten de volgende eigenschappen hebben:
- een `system.out.println` die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
- een beslissingsstructuur die kijkt welk type de vijand heeft;
- aan de hand van de beslissingsstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
- een `system.out.println` die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
- vergeet de hp van de vijand niet te verlagen;
- sluit de methode af met een `system.out.println` die de resteren hp waarde weergeeft van de vijand;

De volgende methodes hebben nog een extra functie:
- `rainDance` heeft geen effect op electric Pokemons maar geeft een `system.out.println` met de boodschap: "has no effect on (vijand)";
- `rainDance` levert een hp boost aan vijanden grass-types;
- `thunder` levert een hp boost aan electric Pokemons;
- `leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;


### Spel logica

Bij Pokémons is het zo dat het type bepalend is voor hoe zwaar de schade is. Hieronder vind je een overzichtje voor een logica van schade bij aanvallen:
- Het type fire🔥 doet de meeste schade aan grass-pokémons🌿, daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.
- Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥, dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.
- Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿, dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.
- Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡, dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Je mag geen code toevoegen, aanpassen of verwijderen uit de `Main` en `PokemonGymImpl` klassen, behalve de nodige imports.
- Een `abstract` super klasse  met 5 `private` `final`  variabelen,  1 `private`variabele, 1 constructor, 6 getters en 1 setter;
- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2 `private` `final` variabelen, 1 constructor, 4 methodes, 1 getter bevatten;
- Een `Main`-klasse met een `main`-methode;
- Een `interface` met 11 methodes;
- Een implementatie (-Impl) van de `interface` waarin alle methodes worden overschreven met een `@Override`;
- 2 "normale" klassen. Waarvan een klasse met 8 variabelen, constructor, getters en setters. De andere klasse extends de eerste klasse en heeft zelf nog 1 variabele, een getter, setter en een constructor die enkel de super aanroept.


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. Loop door [Main](./src/Main.java) en [PokemonGymImpl](./src/PokemonGymImpl.java) en los alle foutmeldingen op door klassens, variabelen en methodes aan te maken en af en toe iets te importeren.
2. Kijk in [Variabelen.java](./src/Variabelen.java) of daar nog niet-geimplementeerde variabelen staan. Plaats deze in de juiste klassen, die je zojuist hebt aangemaakt en geef ze de juiste datatypen.
3. Geef alle variabelen getters en setters als ze in de juiste klasse staan.
4. Doe hetzelfde voor [Methodes.java](./src/Methodes.java).
5. Implementeer de aanval methodes zoals hierboven beschreven. Let daarbij ook op de bijzondere gevallen `raindance`, `thunder` en `leechSeed`.
6. Plaats de methodes in de interface plaatsen zonder uitwerking. Dus alleen het returntype, naam, datatypes van de parameters en de parameters van de methode.


## Bonusopdrachten

1. Voeg de variabele ‘food’ met het juiste datatype toe aan de juiste klasse(n). Voeg ook een methode toe waarbij de hp van de Pokémon een boost krijgt wanneer hij gevoerd wordt.
2. Pas het spel aan zodat je het pokémonvoedsel naar de Pokémon gooit voor een aanval, in plaats van een aanval doet. Als dit voedsel het juiste type is voor dit type Pokémon, zal het de Pokémon een boost geven.
3. Op dit moment kun je het spel oneindig spelen. Pas het spel aan zodat een Pokémon die geen hp meer heeft, niet meer gebruikt kan worden, tenzij het spel opnieuw wordt opgestart.


## Tip

Let goed op welke tips en advies IntelliJ je geeft!



## Inleidingm- Opdr 4

Je hebt inmiddels geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. Dus in plaats van de standaard
hond of kat te kiezen, passen wij deze concepten toe op het onderwerp Pokèmon!

### Wat is een pokemon?

Mischien word je al nostalgisch als je het woord "pokemon" hoort en kan je nog steeds alle 152 originele pokemon uit je hoofd opnoemen in alfabetische volgorde, maar mischien ook niet. We zullen hier kort de belangrijkste aspecten van pokemon uitleggen die je nodig hebt voor de context van deze opdracht en de volgende.

Pokemon is een japanse animatie serie. Op deze serie zijn inmiddels tal van computer en kaart spellen gebaseerd. In deze opdracht gaan we zo'n spel nabootsen. In de spellen is het zo dat jij, de speler, een pokemon trainer bent. Je doel is om pokemons te verzamelen en te trainen om uiteindelijk de beste pokemontrainer ter wereld te worden. Een pokemon is dus eigenlijk een soort dier, maar dan één die speciale krachten/aanvallen heeft. Er zijn een heleboel pokemon, hierboven zag je al dat er 152 originele pokemon zijn, maar inmiddels is daar al wel een vijfvoud van. Gelukkig zijn deze pokemon onder te verdelen in types, voor deze opdracht gebruiken we 4 verschillende types, maar er zijn er veel meer. Er zijn zelfs subtypes en nog veel meer variabelen, maar dat is voor deze opdrachten allemaal niet nodig.
Een leuk feitje over pokemons is dat ze altijd één raar geluidje maken. Zo zegt een Pikachu "pika pika" en verder niks.

### Het spel element
voor het spel element zijn een aantal dingen belangrijk om te begrijpen:
- hp (health points)
- aanvallen
- type

Het is dus de bedoeling dat je de beste pokemontrainer ter wereld wordt, dit kun je bereiken door competities te winnen en je pokemons te trainen. Een pokemon kun je trainen door deze te laten vechten met andere pokemons, na elk gewonnen gevecht wordt je pokemon iets sterker. In zo'n gevecht laat je jou pokemon(s) vechten met de andere. Elke pokemon kan unieke aanvallen doen waarmee ze schade kunnen doen aan een andere pokemon.
Elke pokemon heeft een x aantal "health points" of "hp" en elke keer wanneer deze pokemon schade ontvangt, dan verliest deze een beetje hp. De pokemon die als eerste al zijn hp kwijt is, heeft verloren. Hoe sterker een pokemon is, hoe meer schade een aanval doet. Ook is het elke pokemon effectiever vecht tegen pokemons van een bepaald type en minder effectief tegen pokemons van een ander type, dit verschilt per pokemon. Wanneer  Vaak krijgt de winnende pokemon of pokemontrainer ook een soort van beloning. In de meeste spellen is het ook zo dat je als pokemontrainer mee doet aan een grote competitie waarvan je uiteindelijk de winnaar moet proberen te worden.

## Opdrachtbeschrijving

Je gaat een applicatie programmeren die meerdere nieuwe Pokèmon kan aanmaken. Degenen die bekend zijn met Pokèmon weten
dat deze altijd een _type_ hebben (sterker nog: Pokèmon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokèmon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡.

Naast hun type, hebben Pokèmon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
Super klasse.

![Pokemon!](./Assets/pokemon.JPG)

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een Super klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2
  setters bevatten. _Tip_: wil je wat inspiratie bij het bedenken van variabelen en methodes op het gebied van Pokèmon? Bekijk de
  inspiratie-sectie hieronder eens.
- Een `main`-klasse met een `main`-methode;
- In de `main`-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd. Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;

Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

### Inspiratie en tips

Weet je niet wat voor variabelen je jouw klassen kunt meegeven? Denk eens aan:

- `name`
- `level`
- `hp` (health points)
- `xp` (experience points)
- `height`
- `weight`
- `food`
- `sound`
- `defence`
- `attack`
- `special`
- `accuracy`

Pokèmon kunnen ook ontzettend veel verschillende acties uitvoeren. Zo kun je denken aan de volgende methodes:

- `eats()`
- `speaks()`
- `thunderPunch()`
- `cometPunch()`
- `surf()`
- `leafStorm()`
- `inferno()`
- `electroBall()`
- `pyroBall*()`
- `solarBeam()`
- `hydroPump()`
- `thunder()`
- `hydroCanon()`
- `fireLash()`
- `leechSeed()`
- `voltTackle()`
- `rainDance()`
- `leaveBlade()`
- `flameThrower()`
- `pound()`
- `scratch()`
- `gust()`
- `hornAttack()`
- `psyBeam()`

## Stappenplan
Het is uitdagender om jouw eigen stappenplan te maken, maar als je niet weet waar je wil beginnen kun je dit stappenplan volgen.
1. Maak een `main`-klasse aan in de `src`-map.
2. Maak vervolgens binnen de `main`-klasse een `main`-methode aan. Anders kun je de applicatie immers niet draaien!
3. Maak een Pokèmon Super klasse aan en zorg ervoor dat deze voldoet aan de gestelde randvoorwaarden (
   zie: [randvoorwaarden](#randvoorwaarden))
5. Maak de volgende subklassen aan en laat deze voldoen aan de gestelde randvoorwaarden (
   zie: [randvoorwaarden](#randvoorwaarden)):

- `FirePokemon`
- `WaterPokemon`
- `GrassPokemon`
- `ElectricPokemon`

5. Instantieer in de `main` methode jouw 4 verschillende Pokèmon met de verschillende attributen.

6. Voer in de `main methode` verschillende methodes uit van verschillende `Pokemons`, uit zowel de `subklassen` als uit
   de `super klasse`.

## Bonusopdrachten

1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze appplicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project;
2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!
3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?

## Inleiding - Opdr 3
Welkom bij de derde huiswerkopdracht die jullie gaan maken voor de Backend leerlijn! Je hebt als het goed is de hoofdstukken gelezen op EdHub en je hebt de derde les van de cursus Java gevolgd. In deze opdracht ga je oefenen met arrays, collecties en loops. Dit ga je doen door het maken van een nummer-vertaler.

## Clonen van dit project
1. Clone dit project naar je eigen computer door een nieuw project te maken met de optie `Project from version control` of `get from VCS`, zoals je in de git-workshop geleerd hebt.
2. Ontkoppel de remote met `git remote remove origin`.
3. Maak een nieuwe repository op je eigen github pagina en koppel die aan dit project met `git remote add origin [link naar jou github repo]`
4. Zorg dat je main-branch ook echt "main" heet met `git branch -M main`.
5. Push vervolgens je de (originele) main branch naar je eigen github met `git push -u origin main`.
6. Maak nu een nieuwe huiswerk-branch aan om je huiswerk op te maken met `git checkout -b [naam van je nieuwe branch]`


## Opdrachtbeschrijving

Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.).
Je gaat die getallen vertalen door gebruik te maken van een HashMap.
Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap.
Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit de HashMap te vragen met de bijbehorende sleutel
en dat terug te geven aan de gebruiker.


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object;
- Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2 arrays als parameter en een translate functie;
- De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.

## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. Open de Main class in de `src`-map. Als het goed is zie je hier een `public static void main (String[] args)` methode.
2. Maak in je main methode een Integer array genaamd `numeric` die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
3. Maak in je main methode een String array genaamd `alphabetic` die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
4. Maak een nieuwe class aan en noem deze `Translator`.
5. Maak in de Translator class een `HashMap<Integer,String>` variabele met de naam `numericAlpha`.
6. Maak in de Translator class een constructor die de volgende parameters krijgt: `(String[] alphabetic, Integer[] numeric)`.
7. Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).
8. Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit `numeric` en `alphabetic`. Gebruik de `i` variabele uit je for-loop om de correcte waardes uit de arrays te halen.
9. De constructor is klaar. Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, oftewel: maak in main een nieuw object aan van het type Translator.
10. Maak in de Translator class een nieuwe methode genaamd `translate(Integer number)` die een String returnt.
11. In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van `number`
12. Maak in de main methode van de Main class een boolean variabele genaamd `play` met de waarde `true`. Maak een String variabele genaamd `ongeldig` waarin je de String "ongeldige invoer" zet. Als laatst maak je nog een nieuw Scanner object aan met `Scanner scanner = new Scanner(System.in)`.
13. Vervolgens maak je een while-loop die doorgaat zolang `play` true is.
14. Print in de while-loop `"Type 'x' om te stoppen \nType 'v' om te vertalen"` en maak een String variabele genaamd `input` waarin je de waarde van `scanner.nextLine()` opslaat.
15. Maak in de body van de while-loop een if/else if/else statement.
    1. __if__: Als de `input` "x" is, dan zet je `play` naar false.
    2. __else if__: Als de `input` "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9",
       vervolgens sla je het resultaat van `scanner.nextInt()` op in een variabele `int number`,
       voeg nog een `scanner.nextLine();` toe op de volgende regel (scanner.nextInt doet dit namelijk niet
       van zichzelf)
       en als laatste check je met een if-statement of
        1. __if__: `number` kleiner is dan 10, dan sla je de waarde van `translator.translate(number)` op in `String result` en print je
           `"De vertaling van " + number + " is " + result`.
        2. __else__: anders dan print je `ongeldig`
    4. __else__: Als de `input` dus iets anders dan "x" of "v" is, dan print je `ongeldig`

## Bonus (Mastermind)

Deze opdracht is los staand van de vorige opdracht. Mastermind is een spel waarbij je 4 verschillende random nummers moet raden. Als je een getal goed raadt en deze staat op de juiste plek krijg je + als feedback. Is het nummer goed maar niet op de juiste plek dan krijg je o als feedback. Komt het nummer helemaal niet voor dan krijg je X als feedback. Bij deze opdracht krijg je een stuk code en is het aan jou om hem verder werkend te krijgen en uit te breiden.

1. maak een methode genaamd "randomNumberGenerator" die een hashset met 4 random nummers returned. _Tip:_ Gebruik een while-loop en de java.util.Random class om random nummers aan de set toe te voegen, zolang de set korter is dan 4.
2. maak een methode die een HashSet als parameter inneemt en een string van 4 nummers returned. _Tip:_ Maak een lege String variable (of StringBuilder). Gebruik een for-loop om door de HashSet te loopen om zo elke element uit de Set toe te voegen aan de String (of StringBuilder).
3. voeg de string van 4 nummers als parameter toe bij het aanroepen van de methode "feedback".
   **Bonus-bonus:** maak de methode zo dat je vaker kan raden.
4. Zet onderaan een comment erbij waarom de Hashset eigenlijk geen goede keuze is geweest voor deze opdracht.

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