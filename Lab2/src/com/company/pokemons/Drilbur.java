package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Drilbur extends Pokemon {
    public Drilbur(String name, int level){
        super(name, level);

        setLevel(level <= 30 ? level : 30);

        setType(Type.GROUND);

        double hp = 60,
                attack = 85,
                defense = 40,
                specialAttack = 30,
                specialDefense = 45,
                speed = 68;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new DoubleTeam(), new Swagger(), new Rest());
    }
}