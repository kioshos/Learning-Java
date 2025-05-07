package Task_1;

import java.util.HashMap;
import java.util.Scanner;

public class UserHandler {

    private HashMap<String, String> users = new HashMap<>();
    Scanner in_scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add a new user");
            System.out.println("2. Delete an existing user");
            System.out.println("3. Check if a user exists");
            System.out.println("4. Change user login");
            System.out.println("0. Exit");

            int choice = in_scanner.nextInt();
            in_scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter login: ");
                    String login = in_scanner.nextLine();

                    System.out.println("Enter password: ");
                    String password = in_scanner.nextLine();

                    addUser(login, password);
                    break;
                }
                case 2: {
                    System.out.println("Enter the login of the user to delete: ");
                    String login = in_scanner.nextLine();

                    deleteUser(login);
                    break;
                }
                case 3: {
                    System.out.println("Enter login to check: ");
                    String login = in_scanner.nextLine();

                    if (checkUser(login)) {
                        System.out.println("The user exists!");
                    } else {
                        System.out.println("The user does not exist!");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Enter login: ");
                    String login = in_scanner.nextLine();
                    System.out.println("Enter new login: ");
                    String newLogin = in_scanner.nextLine();
                    boolean isChangedLogin = changeLogin(login, newLogin);

                    if (isChangedLogin) {
                        System.out.println("Login has been changed successfully.");
                    } else {
                        System.out.println("Login has not been changed.");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Exit");
                    return;
                }
            }
        }
    }

    public void addUser(String login, String password) {
        if (checkUser(login)) {
            System.out.println("A user with this login already exists.");
        } else {
            users.put(login, password);
            System.out.println("User has been added.");
        }
    }

    public void deleteUser(String login) {
        if (checkUser(login)) {
            users.remove(login);
            System.out.println("User deleted!");
        } else {
            System.out.println("User not found!");
        }
    }

    public boolean checkUser(String login) {
        return users.containsKey(login);
    }

    public boolean changeLogin(String oldLogin, String newLogin) {
        if (checkUser(oldLogin)) {
            String password = users.get(oldLogin);
            users.remove(oldLogin);
            users.put(newLogin, password);
            return true;
        }

        System.out.println("User not found!");
        return false;
    }
}
