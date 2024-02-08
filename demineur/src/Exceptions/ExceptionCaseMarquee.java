package Exceptions;

public class ExceptionCaseMarquee extends Exception {
    public ExceptionCaseMarquee(){}
    public ExceptionCaseMarquee(String message){
        super(message);
    }
    public ExceptionCaseMarquee(Throwable cause){
        super(cause);
    }
    public ExceptionCaseMarquee(String message, Throwable cause){
        super(message, cause);
    }
}