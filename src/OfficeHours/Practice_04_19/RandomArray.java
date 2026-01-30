package OfficeHours.Practice_04_19;

import java.util.Arrays;
import java.util.Random;

public class RandomArray
{
    public static void main(String[] args)
    {
        int[] a = getRandomIntArray(10, 500);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(getRandomIntArray(10, 500)));
    }

    public static int[] getRandomIntArray(int size, int maxRandomNumber) {

        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxRandomNumber + 1);
        }

        return arr;

    }
}
/*
Challenge: Random Array
1) Ask the user to enter how many numbers they want in their array
2) Ask the user the max number they want for the random numbers –
Use this as the bound for your random number
3) Create an int array with random numbers. The number of elements is based on the given number
Flow:
How many numbers do you want: 5
What is the max number value: 50
-> Print the array with 5 random numbers from 0 to 50
 */