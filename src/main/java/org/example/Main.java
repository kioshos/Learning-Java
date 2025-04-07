package org.example;

import Classes.ATM;
import Classes.Bank;
import Classes.Exceptions.ATMException;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank(4);

            Map<Integer, Integer> initialLoad = new HashMap<>();
            initialLoad.put(100, 10);
            initialLoad.put(50, 20);
            initialLoad.put(10, 50);

            bank.deposit(initialLoad);

            System.out.println("Total balance: " + bank.getTotalBalance());

            ATM atm = bank.getAtms()[0];
            System.out.println("Withdraw 280 UAH: " + atm.withdrawCash(300).toString());
            System.out.println("Total balance: " + bank.getTotalBalance());


        } catch (ATMException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}