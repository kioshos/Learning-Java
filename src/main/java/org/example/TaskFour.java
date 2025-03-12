package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFour {
    public static void FindMinimalElement()
    {
        boolean state = true;
        Scanner sc = new Scanner(System.in);
        int temp = Integer.MAX_VALUE;
        while (state){
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if(number >= 0 && number <= 9){
                state = false;
            }
            else{
                if(temp > number){
                    temp = number;
                }
            }
        }
        System.out.println(temp);
    }
}
