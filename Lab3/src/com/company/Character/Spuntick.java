package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Spuntick implements ClassInterface {
    private String name;
    public Spuntick(){
        name = "Шпунтик";
        joinMain();
    }
    private void joinMain() {
        System.out.println("'"+ name + "' присоединилась к истории.");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Spuntick)obj).name);
    }
    @Override
    public String toString() {
        return "Spuntick{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
