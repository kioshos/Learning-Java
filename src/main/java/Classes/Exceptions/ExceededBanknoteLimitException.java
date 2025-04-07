package Classes.Exceptions;

public class ExceededBanknoteLimitException extends ATMException {
    public ExceededBanknoteLimitException() {
        super("Banknote withdrawal limit has been exceeded");
    }
}
