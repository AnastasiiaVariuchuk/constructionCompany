package main.constructionCompany.myExceptions;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException() {
        super("Invalid Negative Number Exception");
    }
    public NegativeNumberException(String message) {
        super(message);
    }
}
