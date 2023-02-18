package objects;

import enums.Duration;
import exceptions.NotAFoodException;
import exceptions.SpicyForKid;
import interfaces.TakeTheFood;
import interfaces.TasteTheFood;

public class LittleBoy extends Person implements TakeTheFood, TasteTheFood {

    private Eyes eyes = new Eyes();
    private Mouth mouth = new Mouth();
    public LittleBoy(String name){
        super(name);
    }

    @Override
    public void takeTheFood(Global food) throws NotAFoodException{
        if (!(food.getClass().getSuperclass().isAssignableFrom(Food.class) ||
                food.getClass().getSuperclass().getSuperclass().isAssignableFrom(Food.class))){
            throw new NotAFoodException(getName() + " промахнулся вилкой");
        }
        System.out.println(getName() + " взял совсем капельку");
    }

    public void scared(Global global, Duration duration){
        System.out.println(getName() + " " + duration.getTranslate() + " с опаской относился к " + global.getName());
    }

    public void ate(Food food, Duration duration){
        System.out.println(getName() + " " + duration.getTranslate() + " ел такой " + food.getName());
    }

    @Override
    public void tasteTheFood(Food food) throws SpicyForKid {
        System.out.println(getName() + " осторожно попробовал кусочек");
        if (food.getName().equals("Мясо") || food.getName().equals("Мясной соус")) {
            throw new SpicyForKid("Слишком остро для Малыша");
        }
    }

    public void sayOops(){
        System.out.println("Ой!");
    }

    public void suffocate(){
        System.out.println(getName() + " задохнулся");
    }

    public void cry(){
        eyes.cry();
    }

    public void feelHot(){
        mouth.burn();
    }

    public void keepSilence(){
        System.out.println(getName() + " глотнул воздух и молчал");
    }

    private class Eyes extends Global{
        public Eyes(){
            super("Глаза");
        }

        public void cry(){
            System.out.println("Слёзы выступили на " + this.getName());
        }
    }

    private class Mouth extends Global{
        public Mouth(){
            super("Рот");
        }

        public void burn(){
            System.out.println(this.getName() + " горел огнем");
        }
    }
}
