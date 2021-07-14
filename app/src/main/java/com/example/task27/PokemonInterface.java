package com.example.task27;

public interface PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type);

    public String pokemonInfo(Pokemon pokemon);

    public void listPokemon();

}
