package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected String describe(){
        return "использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon satret){
        satret.setMod(Stat.ATTACK, 2);
        Effect.confuse(satret);
    }
}
