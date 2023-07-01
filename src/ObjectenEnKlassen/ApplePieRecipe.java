package ObjectenEnKlassen;

public class ApplePieRecipe {
    Ingredient butter = new Ingredient(200, "gram", "ongezouten boter");
    Ingredient sugar = new Ingredient(200, "gram", "witte suiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk", "egg");
    Ingredient vanilleSugar = new Ingredient(8, "gram", "vanille suiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient((int) 1.5, "kilo", "zoetzure appels" );
    Ingredient crystalSugar = new Ingredient(75, "gram", "suiker");
    Ingredient paneermeel = new Ingredient(15, "gram", "Paneermeel");

    public void printIngredients() {
        System.out.println(butter.getAmount() + butter.getUnit() + butter.getName());
        System.out.println(sugar.getAmount() + sugar.getUnit() + sugar.getName());
        System.out.println(bakmeel.getAmount() + bakmeel.getUnit() + bakmeel.getName());
        System.out.println(egg.getAmount() + egg.getUnit() + egg.getName());
        System.out.println(vanilleSugar.getAmount() + egg.getUnit() + egg.getName());
        System.out.println(salt.getAmount() + salt.getUnit() + salt.getName());
        System.out.println(apple.getAmount() + apple.getUnit() + apple.getAmount());
        System.out.println(crystalSugar.getAmount() + crystalSugar.getUnit() + crystalSugar.getName());
        System.out.println(paneermeel.getAmount() + crystalSugar.getUnit() + crystalSugar.getName());
        /// Voeg " " toe na elke + en verbind opnieuw aan volgende dmv + om spaties te creeren
    }

    public void verwarmOven(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void verdeelEi(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void deegBereiden(){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void appelsBereiden(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void vetSpringvormIn(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }
    public void bedekBodemEnRandMetDeeg(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void appelsGebruik(){
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void deegRestant(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void benutDeegRestant(){
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void bakken(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
