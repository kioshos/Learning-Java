package org.example;

import java.util.Arrays;
import java.util.Random;

public class TaskFive {
    public static int[] GenerateArray(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(-50,100);
        }
        return array;
    }

    public static int[] PositiveNumbers(int[] array) {
        int positiveCount = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > 0)
            {
                positiveCount++;
            }
        }
        int[] positiveArray = new int[positiveCount];
        int pos = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                positiveArray[pos++] = array[i];
            }
        }
        return positiveArray;
    }

    static boolean isFibonacci(int num) {
        if (num < 0) return false;
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num || a == num;
    }

    static boolean IsPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static void DisplayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] FilterEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) result[index++] = num;
        }
        return result;
    }

    public static int[] FilterFibonacciNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isFibonacci(num)) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (isFibonacci(num)) result[index++] = num;
        }
        return result;
    }

    public static int[] FilterNegativeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0 && num > -17) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (num < 0 && num > -17) result[index++] = num;
        }
        return result;
    }

    public static int[] FilterPrimeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (IsPrime(num)) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (IsPrime(num)) result[index++] = num;
        }
        return result;
    }
    public static void ExecuteTaskFive(){
        int[] originalArray = GenerateArray(20);
        System.out.println("Original array:");
        DisplayArray(originalArray);

        int[][] resultArray = {
                FilterEvenNumbers(originalArray),
                FilterFibonacciNumbers(originalArray),
                FilterNegativeNumbers(originalArray),
                FilterPrimeNumbers(originalArray)
        };

        System.out.println("Array of even numbers:");
        DisplayArray(resultArray[0]);

        System.out.println("Array of Fibonacci numbers:");
        DisplayArray(resultArray[1]);

        System.out.println("Array of negative numbers > -17:");
        DisplayArray(resultArray[2]);

        System.out.println("Array of prime numbers:");
        DisplayArray(resultArray[3]);

        System.out.println("Result array:");
        for (int i = 0; i < resultArray.length; i++) {
            DisplayArray(resultArray[i]);
        }
    }
}
