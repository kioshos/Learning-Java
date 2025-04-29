package org.example;

import Task_1.UserHandler;
import Task_3.Caffee;
import Task_3.Guest;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*UserHandler userManager = new UserHandler();
        userManager.start();*/

        Caffee caffee = new Caffee();
        List<Guest> guests = new ArrayList<>() {{
            add(new Guest("Anna", -1, false));
            add(new Guest("Bohdan", -1, false));
            add(new Guest("Catherine", -1, false));
            add(new Guest("Dmytro", -1, false));
            add(new Guest("Elena", -1, false));
            add(new Guest("Fedir", -1, false));
            add(new Guest("Hanna", -1, false));
            add(new Guest("Ihor", -1, false));
            add(new Guest("Julia", -1, false));
            add(new Guest("Kyrylo", -1, false));
        }};

        caffee.reserveTable(guests.get(0),2);
        caffee.reserveTable(guests.get(4),6);
        caffee.reserveTable(guests.get(5),8);

        for (int i = 0; i < guests.size(); i++) {
            Guest guest = guests.get(i);
            caffee.addGuest(guest);
        }

        caffee.seatGuests();
    }
}