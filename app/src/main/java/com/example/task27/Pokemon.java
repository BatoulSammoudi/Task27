package com.example.task27;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    static int counter = 0;
    int attackEnergy = 10;

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - attackEnergy);
    }

}
