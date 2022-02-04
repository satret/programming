package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }
    @Override
    protected String describe(){
        return "использует IceBeam";
    }

    @Override
    protected void applyOppDamage(Pokemon satret, double damage){
        satret.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) {
            Effect.freeze(satret);
        }
        satret.setMod(Stat.ATTACK, 40);//поправь
    }
}