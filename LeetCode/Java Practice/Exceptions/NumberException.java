package Exceptions;

public class NumberException extends RuntimeException {
    public NumberException() {
        super("Password must contain at least one number");
    }
}
