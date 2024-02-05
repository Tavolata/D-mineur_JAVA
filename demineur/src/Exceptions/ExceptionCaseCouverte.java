package Exceptions;

public class ExceptionCaseCouverte extends Exception {
    public ExceptionCaseCouverte(){}
    public ExceptionCaseCouverte(String message){
        super(message);
    }
    public ExceptionCaseCouverte(Throwable cause){
        super(cause);
    }
    public ExceptionCaseCouverte(String message, Throwable cause){
        super(message, cause);
    }
}