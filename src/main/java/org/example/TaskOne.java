package org.example;

import java.util.Scanner;

public class TaskOne {
    public static void ExecuteTask() {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber)
        {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i <= secondNumber; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
