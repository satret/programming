package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage(){
        super(Type.DRAGON, 0, 100);
    }
    @Override
    protected String describe(){
        return "использует DragonRage";
    }

    @Override
    protected void applySelfEffects(Pokemon satret){
        satret.setMod(Stat.ATTACK, 40);//поправь
    }
}