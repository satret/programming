package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Pilyulkin implements ClassInterface {
    private String name;
    public Pilyulkin(){
        name = "Пилюлькин";
        joinMain();
    }
    private void joinMain() {
        System.out.println("'"+ name + "' присоединилась к истории.");
    }
    public void start(Cube obj) {
        System.out.println("'"+obj.getName()+"' приступил к строительству");
    }
    public void spirt(Pilyulkin obj, Sleepwalker obj1) {
        System.out.println("'"+obj.getName()+"' дал нюхнуть '" + obj1.getName() + "' нашатырный спирт '" + obj1.getName() + "'сразу стало лучше");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Pilyulkin)obj).name);
    }
    @Override
    public String toString() {
        return "Pilyulkin{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
