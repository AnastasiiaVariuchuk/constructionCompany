package constructionCompany.myExceptions;

public class ProjectNotFoundedException extends RuntimeException{
    public ProjectNotFoundedException(){
        super("Invalid Project Not Founded Exception");
    }
    public ProjectNotFoundedException(String message) {
        super(message);
    }
}
