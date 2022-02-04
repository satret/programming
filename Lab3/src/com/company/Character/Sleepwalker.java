package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Sleepwalker implements ClassInterface {
    private String name;
    public Sleepwalker(){
        name = "лунатик";
        joinMain();
    }
    private void joinMain() {
        System.out.println("Лунатик '" + name + "' присоединился к истории.");
    }
    public void fly(Sleepwalker obj) {
        System.out.println("'" + obj.getName() + "' летел по инерции в сторону ракеты");
    }
    public void fell(Sleepwalker obj, Pilyulkin obj1, Tube obj2) {
        System.out.println("'" + obj.getName() + "' полетел вниз прямо на руки '"+ obj1.getName() +"' и '"+ obj2.getName()+"'");
    }
    public void paper(Sleepwalker obj, Pilyulkin obj1, Neznayka obj2) {
        System.out.println("'" + obj.getName() + "' потянул '"+ obj1.getName() +"' акцию, где был нарисован '"+ obj2.getName()+"' в скафандре");
    }
    public void say(Sleepwalker obj) {
        System.out.println("'" + obj.getName() + "' окончательно пришел в себя. Он сообщил космонавтам, что его зовут Колосок и живет он в деревне Нееловке");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Sleepwalker)obj).name);
    }
    @Override
    public String toString() {
        return "Sleepwalker{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
