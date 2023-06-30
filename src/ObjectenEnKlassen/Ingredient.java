package ObjectenEnKlassen;

public class Ingredient {
    private int amount;
    private int unit;
    private String name;

    public Ingredient() {
    }
    public Ingredient(int amount, int unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
