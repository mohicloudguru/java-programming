package day61_exceptions;

/**
 * custom exception type
 * that extends RuntimeException
 */
public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(){}

    public InsufficientBalanceException(String message) {
        super(message);
    }
}