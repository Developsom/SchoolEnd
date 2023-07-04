package PokemonInterface;

import java.util.Arrays;

public class ElectricPokemon extends Pokemon{


    public ElectricPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);
        this.attacks = Arrays.asList(
                "Thunder Punch",
                "Electro Ball",
                "Thunder",
                "Volt Tackle"
        );
    }

    void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
