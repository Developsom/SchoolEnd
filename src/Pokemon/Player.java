package Pokemon;

public class Player extends PkBot {
    private int strength;
    private int xpCounter;


    public Player(int hp, int pray, int strength, int xpCounter) {
        super(hp, pray);
        this.strength = strength;
        this.xpCounter = xpCounter;
    }


    @Override
    public void chechHp() {}

    @Override
    public void checkPray() {}

    public void checkStrength(){};

    public void checkXpCounter(){}


    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXpCounter() {
        return xpCounter;
    }
    public void setXpCounter(int xpCounter) {
        this.xpCounter = xpCounter;
    }


}
