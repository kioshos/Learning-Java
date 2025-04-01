package BankService;

import java.io.*;
import java.util.Date;
import java.util.Objects;

public class Account implements Comparable<Account>, Serializable {

    private String cardNumber;
    private String surname;
    private String address;
    private double balance;
    private AccountType typeAccount;
    private Date issuanceDate;
    private Date expiryDate;

    public Account() {}

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber='" + cardNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", typeAccount=" + typeAccount +
                ", issuanceDate=" + issuanceDate +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public AccountType getTypeAccount() { return typeAccount; }
    public void setTypeAccount(AccountType typeAccount) { this.typeAccount = typeAccount; }

    public Date getIssuanceDate() { return issuanceDate; }
    public void setIssuanceDate(Date issuanceDate) { this.issuanceDate = issuanceDate; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, surname, address, balance, typeAccount, issuanceDate, expiryDate);
    }

    @Override
    public int compareTo(Account anotherAccount) {
        if (anotherAccount == null) return 1;
        if (this.cardNumber == null) return -1;
        if (anotherAccount.cardNumber == null) return 1;
        return this.cardNumber.compareTo(anotherAccount.cardNumber);
    }
}
