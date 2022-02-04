package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "использует Recover";
    }

    @Override
    protected void applySelfEffects(Pokemon satret){
        satret.setMod(Stat.HP, 50);//поправь
    }
}