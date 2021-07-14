package com.example.task27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView infoText;
    Pokemon pokemon;
    Pokemon attackedPokemon;
    AbstractPokemon abstractPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoText = findViewById(R.id.infoText);
        pokemon = new Pokemon("POKEMON", 20, "yellow ");
        attackedPokemon = new Pokemon("attacked", 50, "pink");
        pokemon.attackPokemon(attackedPokemon);
        infoText.setText("pokemon attacks  with health equals 50  " +
                " attacked pokemon health now equals  " + attackedPokemon.getHealth() + "number of pokemons now is " + Pokemon.counter
        );
    }
}