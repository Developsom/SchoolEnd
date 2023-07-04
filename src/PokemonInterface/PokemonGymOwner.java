package PokemonInterface;


import java.util.List;

public class PokemonGymOwner {
        String name;
        String town;
        List<Pokemon> pokemons;



        public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
