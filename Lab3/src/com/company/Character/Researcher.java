package com.company.Character;
import com.company.interfaces.ClassInterface;

public class Researcher implements ClassInterface {
    private String name;
    public Researcher(){
        name = "Исследователи";
        joinMain();
    }
    private void joinMain() {
        System.out.println(name + " присоединились к истории.");
    }
    public void experiment(Crystal obj) {
        if (obj instanceof Crystal) {
            System.out.println("Проделав ряд опытов c кристаллами '" + obj.getName() + "' '" + name +"'обнаружили, что кристаллы '"+obj.getName() +"' оказывают одинаковое влияния на способность устранять невесомость");
            //obj.fulfill();
        }
    }
    public void detect(Znayka obj1, Fuchsia obj2, Herring obj3, Shorty obj4) {
        System.out.println("'"+obj1.getName()+"', '"+obj2.getName()+"', '"+obj3.getName()+"' не заметили '"+obj4.getName()+"' который приближался к ним держа какую-то бумажонку");
    }
    public void popal(Sleepwalker obj){
        System.out.println("'"+obj.getName()+"' отбежал холм и попал в зону невесомости");
    }
    public void employment(Znayka obj1, Fuchsia obj2, Herring obj3, Crystal obj4) {
        System.out.println("'"+obj1.getName()+"', '"+obj2.getName()+"', '"+obj3.getName()+"' были заняты исследованием '"+obj4.getName()+"'");
    }
    public void discovery(Znayka obj1, Fuchsia obj2, Herring obj3, Crystal obj4) {
        System.out.println("'"+obj1.getName()+"', '"+obj2.getName()+"', '"+obj3.getName()+"' заметили, что чем больше размер '"+obj4.getName()+"' тем больше зона невесомости");
    }
    public void discovery2(Znayka obj1, Fuchsia obj2, Crystal obj4) {
        System.out.println("'"+obj2.getName()+"'"+"' обнаружила, что зона невесомости '"+obj4.getName()+"' направлена только в одну сторону. '" + obj1.getName() + "' подметил, что из этого можно делить приборы с направленной невесомостью");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Researcher)obj).name);
    }
    @Override
    public String toString() {
        return "Researchers{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
