package Exceptions;

public class SpecialCharacterException extends RuntimeException {
    public SpecialCharacterException() {
        super("Password must have at least one Special Character");
    }
}
