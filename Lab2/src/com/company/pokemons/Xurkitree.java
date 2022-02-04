package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Xurkitree extends Pokemon {
    public Xurkitree(String name, int level){
        super(name, level);

        setLevel(level <= 15 ? level : 15);

        setType(Type.ELECTRIC);

        double hp = 40,
                attack = 45,
                defense = 35,
                specialAttack = 65,
                specialDefense = 55,
                speed = 70;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new ShadowBall(), new IcePunch(), new Recover(), new RockSlide());
    }
}