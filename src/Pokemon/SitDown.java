package Pokemon;

public class SitDown extends PkBot {
    boolean KoPotential; //Checkhp if it is within maxhit
    int MaxHit;


    public SitDown(int hp, int pray, boolean koPotential, int maxHit) {
        super(hp, pray);
        KoPotential = koPotential;
        MaxHit = maxHit;
    }


    @Override
    public void chechHp() {

    }

    @Override
    public void checkPray() {

    }

    public void checkKoPotential(){

    }
    public void checkMaxhit(){

    }

    public boolean getKoPotential() {
        return KoPotential;
    }

    public void setKoPotential(boolean koPotential) {
        KoPotential = koPotential;
    }

    public int getMaxHit() {
        return MaxHit;
    }

    public void setMaxHit(int maxHit) {
        MaxHit = maxHit;
    }

}
