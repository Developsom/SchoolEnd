package PokemonInterface;

abstract public class Pokemon {
    String name;
    int lvl;
    int hp;
    String food;
    String sound;

    public Pokemon(String name, int lvl, int hp, String food, String sound) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }
}
//check
// i dont want to move to fast and endup restarting the project for a second time
// Removed type from Pokemon because in the main it does not fill a type-argument
// Succesfully created 1 Abstract-Super class with 4 subclasses
