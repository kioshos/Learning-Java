package BankService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    public Account getAccountByNumber(String cardNumber, List<Account> accounts) {
        for (Account account : accounts) {
            if (account.getCardNumber().equals(cardNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAccountsByType(AccountType type, List<Account> accounts) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getTypeAccount().equals(type)) {
                result.add(account);
            }
        }
        return result;
    }

    public void saveToFile(List<Account> accounts, String fileName) {
        try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outStream.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public List<Account> loadFromFile(String fileName) {
        List<Account> accounts = new ArrayList<>();
        try (ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(fileName))) {
            accounts = (List<Account>) objStream.readObject();
        } catch (EOFException e) {
            System.out.println("File is empty");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Desearlization error: " + e.getMessage());
        }
        return accounts;
    }
}
