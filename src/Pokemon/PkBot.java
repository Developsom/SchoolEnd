package Pokemon;

public abstract class PkBot {
    int hp;
    int pray;

    public abstract void chechHp();
    public abstract void checkPray();


    public PkBot(int hp, int pray) {
        this.hp = hp;
        this.pray = pray;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPray() {
        return pray;
    }

    public void setPray(int pray) {
        this.pray = pray;
    }
}


