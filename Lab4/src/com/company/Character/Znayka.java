package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Znayka implements ClassInterface {
    private String name;
    public Znayka(){
        name = "Знайка";
        joinMain();
    }

    private void joinMain() {
        System.out.println("Знайка '" + name + "' присоединился к истории.");
    }
    public void off(Znayka obj) {
        System.out.println("заметив это '" + obj.getName() + "' выключил прибор невесомости");
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Znayka)obj).name);
    }
    @Override
    public String toString() {
        return "Znayka{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
