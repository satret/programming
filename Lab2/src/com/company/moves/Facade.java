package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }

    @Override
    protected void applyOppDamage(Pokemon satret, double damage) {
        Status p_stat = satret.getCondition();
        if (p_stat.equals(Status.BURN) || p_stat.equals(Status.POISON) || p_stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(satret, damage * 2);
        } else {
            super.applyOppDamage(satret, damage);
        }
    }
}