package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Cube implements ClassInterface {
    private String name;
    public Cube(){
        name = "Кубик";
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
        return this.name.equals(((Cube)obj).name);
    }
    @Override
    public String toString() {
        return "Cube{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
