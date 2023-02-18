package exceptions;

public class NotAFoodException extends RuntimeException{

    public NotAFoodException(String message){
        super(message);
    }
}
