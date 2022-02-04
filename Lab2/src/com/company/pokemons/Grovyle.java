package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Grovyle extends Treecko {
    public Grovyle(String name, int level){
        super(name, level);

        setLevel(level <= 16 ? level : 16);

        setType(Type.GRASS);

        double hp = 50,
                attack = 65,
                defense = 45,
                specialAttack = 85,
                specialDefense = 65,
                speed = 95;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new Facade(), new Rest(), new DragonRage());
    }
}