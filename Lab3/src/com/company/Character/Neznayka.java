package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Neznayka implements ClassInterface {
    private String name;
    public Neznayka(){
        name = "Незнайка";
        joinMain();
    }
    private void joinMain() {
        System.out.println("Незнайка '" + name + "' присоединился к истории.");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Neznayka)obj).name);
    }
    @Override
    public String toString() {
        return "Neznayka{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
