package org.example;

import java.util.Random;

public class TaskSix {
    public static int[] GenerateArray(int arrayLength)
    {
        int[] array = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void DisplayArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int FindMaxElementIndex(int[] array)
    {
        int maxElementIndex = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[maxElementIndex])
            {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
    public static void SortAnArray()
    {
        int[] array = GenerateArray(10);
        DisplayArray(array);
        int maxElementIndex = FindMaxElementIndex(array);
        for (int i = 0; i < maxElementIndex - 1; i++)
        {
            for (int j = 0; j < maxElementIndex - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}
