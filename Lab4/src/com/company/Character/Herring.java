package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Herring implements ClassInterface {
    private String name;
    public Herring(){
        name = "Селёдочка";
        joinMain();
    }
    private void joinMain() {
        System.out.println("Исследователь '" + name + "' присоединилась к истории.");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Herring)obj).name);
    }
    @Override
    public String toString() {
        return "Herring{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
