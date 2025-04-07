package Classes;

import Classes.Exceptions.ATMException;
import Classes.Exceptions.ExceededBanknoteLimitException;
import Classes.Exceptions.InsufficientFundsException;
import Classes.Exceptions.InvalidDepositException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ATM {
    private static final int MAX_WITHDRAWAL_AMOUNT = 5000;
    private static final int MAX_WITHDRAWAL_BANKNOTE_AMOUNT = 30;
    private static final int[] NOMINALS = {1, 2, 5, 10, 20, 50, 100, 200, 500};
    private int balance;
    public int getBalance() {
        return balance;
    }

    private final Map<Integer,Integer> cash;

    public ATM() {
        cash = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i < NOMINALS.length; i++){
            cash.put(NOMINALS[i], 0);
        }
    }

    public void depositCash(Map<Integer,Integer> deposit) throws InvalidDepositException {
        for(Map.Entry<Integer,Integer> entry : deposit.entrySet()){
            if(!cash.containsKey(entry.getKey()) || entry.getValue() < 0){
                throw new InvalidDepositException();
            }
            cash.put(entry.getKey(), cash.get(entry.getKey()) + entry.getValue());
            balance += entry.getValue() * entry.getKey();
        }
    }

    public Map<Integer, Integer> withdrawCash(int amountToWithdraw) throws ATMException {
        if(amountToWithdraw > MAX_WITHDRAWAL_AMOUNT){
            throw new InsufficientFundsException();
        }
        if(amountToWithdraw > balance){
            throw new InsufficientFundsException();
        }

        HashMap<Integer,Integer> result = new HashMap<>();

        int remains = amountToWithdraw;

        int banknoteCount = 0;

        for(int denomination : cash.keySet()){
            if(remains == 0){
                break;
            }
            int count = remains / denomination;
            if(count > 0){
                result.put(denomination, count);
                remains -= count * denomination;
                banknoteCount += count;
            }

        }

        if(remains > 0){
            throw new InsufficientFundsException();
        }

        if(banknoteCount > MAX_WITHDRAWAL_BANKNOTE_AMOUNT){
            throw new ExceededBanknoteLimitException();
        }
        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            cash.put(entry.getKey(), cash.get(entry.getKey()) - entry.getValue());
            balance -= entry.getValue() * entry.getKey();
        }
        return  result;
    }

}
