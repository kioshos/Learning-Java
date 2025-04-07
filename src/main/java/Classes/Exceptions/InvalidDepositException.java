package Classes.Exceptions;

public class InvalidDepositException extends ATMException {
    public InvalidDepositException() {
        super("Invalid banknote loading");
    }
}
