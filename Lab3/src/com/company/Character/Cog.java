package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Cog implements ClassInterface {
    private String name;
    public Cog(){
        name = "Винтик";
        joinMain();
    }
    private void joinMain() {
        System.out.println("'"+ name + "' присоединилась к истории.");
    }
    public void build(Cog obj, Spuntick obj1, Rover obj2) {
        System.out.println("'"+obj.getName()+"' и '" + obj1.getName() + "' принялись собирать '" + obj2.getName() + "', который был разобран");
    }
    public void wakeup(Cog obj, Spuntick obj1, Rover obj2) {
        System.out.println("'"+obj.getName()+"' и '" + obj1.getName() + "' очнулись на стоительной площадке с своим '"+ obj2.getName() + "ом' и на площадку начали поступать писоматериалы");
    }
    public void work(Cog obj, Spuntick obj1){
        System.out.println("Работа на строй площадке велась в условиях невесомости, что облегчало работу '" + obj.getName()+"а' и '" + obj1.getName() + "а'");
    }
    public void rapair(Cog obj, Spuntick obj1, Znayka obj2, Sleepwalker obj3){
        System.out.println("'" + obj2.getName() + "' велел '" + obj.getName()+"у' и '" + obj1.getName() + "у' " + "начать ремонтировать приборы сломанные '" + obj3.getName() + "ами'");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Cog)obj).name);
    }
    @Override
    public String toString() {
        return "Cog{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
