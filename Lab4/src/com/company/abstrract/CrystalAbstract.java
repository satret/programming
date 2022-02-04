package com.company.abstrract;

import com.company.interfaces.CrystalInterface;

public abstract class CrystalAbstract implements CrystalInterface {
    private boolean big;
    public CrystalAbstract(boolean big) {
        this.big = big;
    }
    @Override
    public boolean isbig() {
        return big;
    }
    @Override
    public void setbig(boolean sizebig) {
        this.big = sizebig;
    }
}
