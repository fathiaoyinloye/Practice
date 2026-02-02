package Exceptions;

public class BlankException extends RuntimeException{
    public BlankException(){
        super("Password Must Not Be Blank");
    }
}
