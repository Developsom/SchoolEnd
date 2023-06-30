package ObjectenEnKlassen;

public class Main {
    private static ApplePieRecipe applePieRecipe;
    public static void main(String[] args) {
        applePieRecipe.appelsBereiden();
        applePieRecipe.bakken();
        applePieRecipe.bedekBodemEnRandMetDeeg();
        applePieRecipe.appelsGebruik();
        applePieRecipe.benutDeegRestant();
        applePieRecipe.deegBereiden();
        applePieRecipe.verdeelEi();
        applePieRecipe.vetSpringvormIn();
        applePieRecipe.verwarmOven();
        applePieRecipe.deegRestant();
    }

    public static void setApplePieRecipe(ApplePieRecipe applePieRecipe) {
        Main.applePieRecipe = applePieRecipe;
    }
}

//Continue from printing the methods
