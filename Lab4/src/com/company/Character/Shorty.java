package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Shorty implements ClassInterface {
    private String name;
    public Shorty(){
        name = "коротышка";
        joinMain();
    }
    private void joinMain() {
        System.out.println("Коротышка '" + name + "' присоединился к истории.");
    }
    public void savemg(Crystal obj){
        System.out.println("'"+ obj.getName()+" помогает '" + name + "' сохраняет тяжесть");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Shorty)obj).name);
    }
    @Override
    public String toString() {
        return "Shorty{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}