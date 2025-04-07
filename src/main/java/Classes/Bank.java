package Classes;
import Classes.Exceptions.InvalidDepositException;
import java.util.Map;

public class Bank {
    private ATM[] atms;
    public ATM[] getAtms() {
        return atms;
    }

    public Bank(int atmCount) {
        atms = new ATM[atmCount];
        for (int i = 0; i < atmCount; i++) {
            atms[i] = new ATM();
        }
    }
    public void deposit(Map<Integer,Integer> deposit) throws InvalidDepositException {
        for(int i = 0; i < atms.length; i++) {
            atms[i].depositCash(deposit);
        }
    }
    public int getTotalBalance(){
        int sum = 0;
        for(int i = 0; i < atms.length; i++) {
            sum += atms[i].getBalance();
        }
        return sum;
    }

}
