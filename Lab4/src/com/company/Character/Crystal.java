package com.company.Character;
import com.company.abstrract.CrystalAbstract;
import com.company.enums.CrystalSize;
import com.company.interfaces.CrystalInterface;

public class Crystal extends CrystalAbstract {
    private final String name;
    private CrystalSize TYPE = CrystalSize.SMALL;
    public Crystal(){
        super(true);
        name = "BIG Антилунит";
        joinMain();
    }
    public Crystal(String name) {
        super(true);
        this.name = name;
        joinMain();
    }
    private void joinMain() {
        System.out.println("Кристал '" + name + "' присоединился к истории.");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Crystal)obj).name);
    }
    @Override
    public int hashCode() {
        if (isbig()) return name.hashCode() + name.length();
        return name.hashCode();
    }
    @Override
    public String toString() {
        return "Crystal{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public CrystalInterface GetType() {
        return null;
    }
}
