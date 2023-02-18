import enums.Duration;
import exceptions.NotAFoodException;
import exceptions.SpicyForKid;
import objects.*;

public class Main {
    public static void main(String[] args) {

        Carlson carlson = new Carlson("Карлсон");
        LittleBoy littleBoy = new LittleBoy("Малыш");
        MissBok missBok = new MissBok("Фрекен Бок");

        Food meat = new Meat("Мясо");
        Food meatSauce = new Meat.MeatSauce("Мясной соус");
        Food newDishes = new Food("Новые блюда");


        try {
            carlson.takeTheFood(meatSauce);
        }
        catch (NotAFoodException e){
            System.out.println(e.getMessage());
        }
        try {
            littleBoy.takeTheFood(meat);
        }
        catch (NotAFoodException e){
            System.out.println(e.getMessage());
        }

        littleBoy.scared(newDishes, Duration.ALWAYS);
        littleBoy.ate(meatSauce, Duration.NEVER);

        carlson.startBuildingACastle(new Moat("Крепостной ров"){
            @Override
            public void toBeFilledIn(Food meatSauce){
                System.out.println("заполненный " + meatSauce.getName());
            }
        });

        try {
            littleBoy.tasteTheFood(meat);
        }
        catch(SpicyForKid e) {
            littleBoy.sayOops();
            littleBoy.cry();
            littleBoy.feelHot();

            missBok.standBy();
            missBok.aggressiveLookAtSo(littleBoy);

            littleBoy.keepSilence();
        }
    }
}