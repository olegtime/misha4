package objects;

import enums.Intensity;
import exceptions.NotAFoodException;
import interfaces.TakeTheFood;

public class Carlson extends Person implements TakeTheFood {
    public Carlson(String name){
        super(name);
    }

    @Override
    public void takeTheFood(Global food) throws NotAFoodException {
        if (!(food.getClass().getSuperclass().isAssignableFrom(Food.class) ||
                food.getClass().getSuperclass().getSuperclass().isAssignableFrom(Food.class))){
            throw new NotAFoodException(getName() + " перепутал еду с чем-то ещё");
        }
        System.out.println(getName() + " " + Intensity.QUICKLY.getTranslate() + " наложил себе полную тарелку " + food.getName());
    }

    public void startBuildingACastle(Moat moat){
        class MeatTower{
            public final String NAME = "Башня из мяса";

            public String getName(){
                return NAME;
            }
        }

        MeatTower meatTower = new MeatTower();

        System.out.print(getName() + " начал строить " + meatTower.getName());
        System.out.print(", а вокруг " + meatTower.getName() + " " + moat.getName() + ", ");
        moat.toBeFilledIn(new Meat.MeatSauce("Мясной соус"));
    }
}
