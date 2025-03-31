package BankService;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public Account GetAccountByNumber(String cardNumber, List<Account> accounts){
        for(int i = 0; i < accounts.size(); i++){
           if(accounts.get(i).getCardNumber().equals(cardNumber)){
              return accounts.get(i);
           }
        }
        return null;
    }

    public List<Account> GetAccountsByType(AccountType type,List<Account> accounts){
        List<Account> result = new ArrayList<>();
        for(int i = 0; i < accounts.size(); i++){

            if(accounts.get(i).getTypeAccount().equals(type)){
                result.add(accounts.get(i));
            }
        }
        return result;
    }
}
