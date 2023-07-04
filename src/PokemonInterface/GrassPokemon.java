package PokemonInterface;

import java.util.Arrays;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);
        this.attacks = Arrays.asList(
                "Leaf Storm",
                "Solar Beam",
                "Leech Seed",
                "Leave Blade"
        );
    }

    void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
