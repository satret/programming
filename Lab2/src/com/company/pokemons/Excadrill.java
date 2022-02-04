package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Excadrill extends Drilbur {
    public Excadrill(String name, int level){
        super(name, level);

        setLevel(level <= 31 ? level : 31);

        setType(Type.GROUND, Type.STEEL);

        double hp = 110,
                attack = 135,
                defense = 60,
                specialAttack = 50,
                specialDefense = 65,
                speed = 88;
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);

        setMove(new DoubleTeam(), new Swagger(), new Rest(), new DreamEater());
    }
}