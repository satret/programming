package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Sceptile extends Grovyle {
    public Sceptile(String name, int level){
        super(name, level);

        setLevel(level <= 36 ? level : 36);

        setType(Type.GRASS);

        double hp = 70,
                attack = 85,
                defense = 65,
                specialAttack = 105,
                specialDefense = 85,
                speed = 120;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new Facade(), new Rest(), new DragonRage(), new IceBeam());
    }
}