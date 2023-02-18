package interfaces;

import exceptions.NotAFoodException;
import objects.Global;

public interface TakeTheFood {
    void takeTheFood(Global food) throws NotAFoodException;
}
