package day0_FastTrack.loops;

import java.util.Scanner;

public class LoopPractice
{
    public static void main(String[] args)
    {
        int sum =0;
        int i=1;

        while (i<10)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("Enter some numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maxNumber = number;

        while (number != 0)
        {
            number = scanner.nextInt();
            if (number > maxNumber)
            {
                maxNumber = number;
            }
        }
        System.out.println("Max value " +maxNumber);


    }
}
