package org.example;
import BankService.Account;
import BankService.AccountService;
import BankService.AccountType;
import Musically.*;
import TaskTwo.Article;
import TaskTwo.Frequency;
import TaskTwo.Human;
import TaskTwo.Magazine;
import ZooAnimals.*;
import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void DisplayAccounts(List<Account> accounts){
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(accounts.get(i).toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Task One");
        var accounts = new Account[10];
        Random random = new Random();
        Faker faker = new Faker();
        String[] cardNumbers = {
                "5161216555677935",
                "5327528592341320",
                "547346873579746",
                "4485527428352",
                "4539675334347581",
                "5495665122562581",
                "5187518764845538",
                "4556846582856957",
                "5333677499651356",
                "5563844545733288"
        };

        for(int i = 0; i < accounts.length; i++){
            var temp = new Account();
            temp.setCardNumber(cardNumbers[i]);
            temp.setAddress(faker.address().fullAddress());
            temp.setBalance(random.nextDouble(50,300));
            temp.setSurname(faker.name().fullName());
            temp.setTypeAccount(AccountType.values()[random.nextInt(AccountType.values().length)]);
            temp.setIssuanceDate(faker.date().birthday());
            temp.setExpiryDate(faker.date().birthday());
            accounts[i] = temp;
        }

        for(int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i].toString());
        }



        AccountService accountService = new AccountService();
        var debitAccounts = accountService.getAccountsByType(AccountType.Debit, Arrays.stream(accounts).toList());
        var creditAccounts = accountService.getAccountsByType(AccountType.Credit, Arrays.stream(accounts).toList());
        var account = accountService.getAccountByNumber("5495665122562581", Arrays.stream(accounts).toList());
        System.out.println();
        System.out.println("Account by card number 5495665122562581");
        System.out.println(account.toString());
        System.out.println();
        System.out.println("Debit accounts");
        DisplayAccounts(debitAccounts);
        System.out.println();
        System.out.println("Credit accounts");
        DisplayAccounts(creditAccounts);
        System.out.println();
        System.out.println("Task Two");
        System.out.println();
        Human author = new Human(faker.name().firstName(), faker.name().lastName(), faker.date().birthday());
        Article article1 = new Article(author, "Computer Science education in 2025", 4.8);
        Article article2 = new Article(author, "The Future of Federated Learning", 5.0);

        Magazine magazine = new Magazine("Tech World", Frequency.Monthly, LocalDate.now(), 10000, List.of(new Article[]{article1, article2}));
        magazine.PrintArticles();

        System.out.println(magazine.toString());
        System.out.println();
        System.out.println("Task Three");
        System.out.println();
        Zoo zoo = new Zoo();
        Wolf wolf = new Wolf("Grey");
        zoo.addAnimal(wolf);
        zoo.addAnimal(wolf);
        zoo.addAnimal(new Tiger("Tigerian"));
        zoo.addAnimal(new Rabbit("Buggs"));
        zoo.addAnimal(new Kangaroo("Jackie"));
        System.out.println(zoo.toString());
        System.out.println(zoo.getAnimals());
        zoo.AnimalSound(wolf);
        System.out.println(zoo.CountPredators(zoo.getAnimals()));

        zoo.CountFoodAmount(zoo.getAnimals());
        System.out.println();
        System.out.println("Task four");
        System.out.println();

        MusicalInstrument[] instruments = {
                new Violin(),
                new Cello(),
                new Trombone(),
                new Ukulele()
        };

        for(MusicalInstrument instrument : instruments){
           instrument.ShowName();
           instrument.Sound();
           instrument.Description();
           instrument.History();
           System.out.println("_____________________________");


        }
        AccountService service = new AccountService();
        service.saveToFile(Arrays.stream(accounts).toList(), "accounts.dat");
        List<Account> accounts1 = service.loadFromFile("accounts.dat");
        DisplayAccounts(accounts1);
    }
}