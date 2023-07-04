package PokemonInterface;

import java.util.List;

abstract public class Pokemon {
    String name;
    int lvl;
    int hp;
    String food;
    String sound;

    String type;
    List<String> attacks;

    public Pokemon(String name, int lvl, int hp, String food, String sound) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    } // this Getter should resolve gymPokemon.getName()

    public int getHp() {
        return hp;
    } // Resolve for (pokemon.getHp() > 0 && gymPokemon.getHp() > 0)

    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;  ///Resolved System.out.println(fp.getAttacks() and more
    }

    public int getLevel() {
        return lvl;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }
}


//check
// i dont want to move to fast and endup restarting the project for a second time
// Removed type from Pokemon because in the main it does not fill a type-argument
// Succesfully created 1 Abstract-Super class with 4 subclasses
