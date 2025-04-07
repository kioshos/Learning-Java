package Classes.Exceptions;

public class InsufficientFundsException extends ATMException {
    public InsufficientFundsException() {
        super("Not enough funds in ATM: ");
    }
}
