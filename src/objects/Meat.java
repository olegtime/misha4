package objects;

public class Meat extends Food{
    public Meat(String name){
        super(name);
    }

    public static class MeatSauce extends Meat{
        public MeatSauce(String name){
            super(name);
        }
    }
}
