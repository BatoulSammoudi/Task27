package com.example.task27;

public abstract class AbstractPokemon implements PokemonInterface {
    public AbstractPokemon() {
    }

    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        return pokemon;
    }

    public String pokemonInfo(Pokemon pokemon) {
        return pokemon.getName() + pokemon.getType() + pokemon.getHealth();
    }

}
