package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "использует DoubleTeam";
    }

    @Override
    protected void applyOppEffects(Pokemon satret){
        satret.setMod(Stat.EVASION, 1);
    }
}