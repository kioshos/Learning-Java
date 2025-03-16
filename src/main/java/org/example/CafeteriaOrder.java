package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem{
    String Name;
    int Price;
    public MenuItem(String itemName, int price) {
        Name = itemName;
        Price = price;
    }
}

public class CafeteriaOrder {
        public static void CountOrder() {

           Scanner sc = new Scanner(System.in);

           List<MenuItem> menu = new ArrayList<MenuItem>();
           menu.add(new MenuItem("Coffee", 75));
           menu.add(new MenuItem("Croissant", 70));
           menu.add(new MenuItem("Tea", 40));
           menu.add(new MenuItem("Cake", 64));
           menu.add(new MenuItem("Fresh juice", 50));

           System.out.println("How many people will order?");
           int numberOfPeople = sc.nextInt();
           sc.nextLine();

           int totalSum = 0;

           for(int i=0; i<numberOfPeople; i++) {
                System.out.println("Menu for client " + i);
               for (int j = 0; j < menu.size(); j++) {
                   System.out.println((j + 1) + ". " + menu.get(j).Name + " - " + menu.get(j).Price + " UAH");
               }

               int personTotal = 0;

               while (true) {
                   System.out.print("Number of menu item:  (press 0 to order)");

                   int choice = sc.nextInt();

                   if (choice == 0) break;

                   if (choice < 1 || choice > menu.size()) {
                       System.out.println("Error: invalid choice");
                       continue;
                   }
                   personTotal += menu.get(choice - 1).Price;
               }
               System.out.println("Spends for person: "+ i + " is " + personTotal);
               totalSum += personTotal;
           }
           System.out.println("Total sum: " + totalSum);
           sc.close();
        }
}
