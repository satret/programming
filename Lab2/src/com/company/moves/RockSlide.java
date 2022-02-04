package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected String describe(){
        return "использует RockSlide";
    }

    @Override
    protected void applyOppEffects(Pokemon satret){
        if (Math.random() <= 0.3) {
            Effect.flinch(satret);
        }
    }
    }