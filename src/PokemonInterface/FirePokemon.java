package PokemonInterface;

import java.util.Arrays;

public class FirePokemon extends Pokemon{

    public FirePokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);
        this.attacks = Arrays.asList(
                "Inferno",
                "Pyro Ball",
                "Flame Thrower",
                "Fire Lash"
        );
    }

    void inferno(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }

    void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }
}

// De FirePokemon klasse extend de basis attritubuten die iedere Pokemon over beschikt
// Door de constructor te initializen; werden de parameters actief en zijn de argumenten op de juiste plek gevallen.
