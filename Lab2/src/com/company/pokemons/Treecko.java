package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Treecko extends Pokemon {
    public Treecko(String name, int level){
        super(name, level);

        setLevel(level <= 15 ? level : 15);

        setType(Type.GRASS);

        double hp = 83,
                attack = 89,
                defense = 71,
                specialAttack = 173,
                specialDefense = 71,
                speed = 83;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new Facade(), new Rest());
    }
}