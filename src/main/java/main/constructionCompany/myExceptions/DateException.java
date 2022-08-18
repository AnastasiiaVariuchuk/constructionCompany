package main.constructionCompany.myExceptions;

public class DateException extends Exception{

    public DateException() {
        super("Invalid Date Exception");
    }

    public DateException( String message) {
        super(message);
    }
}
