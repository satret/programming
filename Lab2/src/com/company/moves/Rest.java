package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe(){
        return "использует Recover";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e2 = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
    }
}