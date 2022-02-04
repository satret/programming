package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Tube implements ClassInterface {
    private String name;
    public Tube(){
        name = "Тюбик";
        joinMain();
    }
    private void joinMain() {
        System.out.println("'"+ name + "' присоединилась к истории.");
    }
    public void start(Cube obj) {
        System.out.println("'"+obj.getName()+"' приступил к строительству");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Tube)obj).name);
    }
    @Override
    public String toString() {
        return "Tube{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
