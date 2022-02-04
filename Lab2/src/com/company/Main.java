package com.company;
import com.company.pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Xurkitree("ВМК", 1);
        Pokemon p2 = new Drilbur("МФТИ", 1);
        Pokemon p3 = new Excadrill("КТ", 1);
        Pokemon p4 = new Treecko("СППО", 1);
        Pokemon p5 = new Grovyle("ИСИТ", 1);
        Pokemon p6 = new Sceptile("ВШЭ", 1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}
