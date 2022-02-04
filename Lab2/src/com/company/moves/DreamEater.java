package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected String describe(){
        return "использует DreamEater";
    }

    @Override
    protected void applySelfEffects(Pokemon satret){
        satret.setMod(Stat.HP, 50);//поправь
    }
}