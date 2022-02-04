package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Fuchsia implements ClassInterface {
    private String name ;
    public Fuchsia(){
        name = "Фуксия";
        joinMain();
    }
    private void joinMain() {
        System.out.println("Исследователь '" + name + "' присоединилась к истории.");
    }
    public void sayhardphysics(){
        System.out.println("'"+name+"' объяснила это сложное явление с невесомостью");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Fuchsia)obj).name);
    }
    @Override
    public String toString() {
        return "Fuschia{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
