package Pokemon;

public class Escape extends PkBot {
    int food;
    int runEnergy;

    public Escape(int hp, int pray, int food, int runEnergy) {
        super(hp, pray);
        this.food = food;
        this.runEnergy = runEnergy;
    }

    @Override
    public void chechHp() {

    }

    @Override
    public void checkPray() {

    }
    public void checkFood(){}
    public void checkRunEnergy(){}

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getRunEnergy() {
        return runEnergy;
    }

    public void setRunEnergy(int runEnergy) {
        this.runEnergy = runEnergy;
    }
}