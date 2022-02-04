package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected String describe(){
        return "использует ShadowBall";
    }

    @Override
    protected void applyOppEffects(Pokemon satret){
        if (Math.random() <= 0.2) {
            satret.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }
}