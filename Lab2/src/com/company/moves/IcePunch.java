package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class IcePunch extends PhysicalMove {
    public IcePunch(){
        super(Type.ICE, 75, 100);
    }
    @Override
    protected String describe(){
        return "использует IcePunch";
    }

    @Override
    protected void applyOppDamage(Pokemon satret, double damage){
        satret.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) {
            Effect.freeze(satret);
        }
    }
}