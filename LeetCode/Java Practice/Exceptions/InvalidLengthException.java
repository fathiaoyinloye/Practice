package Exceptions;

public class InvalidLengthException extends RuntimeException {
    public InvalidLengthException() {
        super("Password must be between 8 to 20 characters long");
    }
}
