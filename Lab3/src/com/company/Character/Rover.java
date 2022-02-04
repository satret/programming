package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Rover implements ClassInterface {
    private String name;
    public Rover(){
        name = "Вездеход";
        joinMain();
    }
    private void joinMain() {
        System.out.println("'"+ name + "' присоединилась к истории.");
    }
    public static class Boilcistern {
        public void function(Rover obj){
            String name1;
            name1 = "цистерна для кипечнеия воды";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class Drill {
        public void function(Rover obj){
            String name1;
            name1 = "бур для сверления скважин";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class Washingmachine {
        public void function(Rover obj){
            String name1;
            name1 = "стиральная машина";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class Plough {
        public void function(Rover obj){
            String name1;
            name1 = "плуг для вспашки земли";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class Pump {
        public void function(Rover obj){
            String name1;
            name1 = "центробежный насос с разбрызгивателем для поливки растений";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class AirConditioning {
        public void function(Rover obj){
            String name1;
            name1 = "аппарат для очистки и кондиционирования воздуха";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class Dinamo {
        public void function(Rover obj){
            String name1;
            name1 = "динамо-машина для выработки электроэнергии";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class RadioStation {
        public void function(Rover obj){
            String name1;
            name1 = "коротковолновая радиостанция";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class DitchDigger {
        public void function(Rover obj){
            String name1;
            name1 = "канавокопатель";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
    public static class VacuumCleaner {
        public void function(Rover obj){
            String name1;
            name1 = "пылесос";
            System.out.println("'"+ obj.getName() + "' имеет '" + name1 + "'");
        }
    }
//бур для сверления скважин
//стиральная машина
//плуг для вспашки земли
// центробежный насос с разбрызгивателем для поливки растений
// аппарат для очистки и кондиционирования воздуха
// динамо-машина для выработки электроэнергии
// коротковолновая радиостанция
// канавокопатель
// пылесос
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Rover)obj).name);
    }
    @Override
    public String toString() {
        return "Rover{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
