package Pokemon;

public class PlayerStats extends PkBot {
    int strengthLevel;
    int specialAttack;

    public PlayerStats(int hp, int pray, int strengthLevel, int specialAttack) {
        super(hp, pray);
        this.strengthLevel = strengthLevel;
        this.specialAttack = specialAttack;
    }

    @Override
    public void chechHp() {

    }

    @Override
    public void checkPray() {

    }

    public void checkStengthLevel(){}
    public void checkSpecialAttack(){}

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }
}
