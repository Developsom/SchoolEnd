package PokemonInterface;

import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemons; //Resolve trainer.getPokemons()

    public PokemonTrainer(String name, List<Pokemon> pokemons) {}

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}


// Created constructor based on arguments in:         PokemonTrainer player1 = new PokemonTrainer(userA, pokemons);