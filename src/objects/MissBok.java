package objects;

public class MissBok extends Person{

    public MissBok(String name){
        super(name);
    }

    public void standBy(){
        System.out.println(getName() + " стояла рядом");
    }

    public void aggressiveLookAtSo(Person person){
        System.out.println(getName() + " глядела на " + person.getName() + ", что ");
    }
}
