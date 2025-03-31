package BankService;

import java.util.Date;

public class Account {

    private String cardNumber;
    private String surname;
    private String address;
    private double balance;
    private AccountType typeAccount;
    private Date issuanceDate;
    private Date expiryDate;

    public Account() {

    }

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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(AccountType typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
