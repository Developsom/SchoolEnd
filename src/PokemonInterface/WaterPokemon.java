package PokemonInterface;

import java.util.Arrays;

public class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);
        this.attacks = Arrays.asList(
                "Surf",
                "Hydro Pump",
                "Hydro Canon",
                "Rain Dance"
        );
    }

    void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
