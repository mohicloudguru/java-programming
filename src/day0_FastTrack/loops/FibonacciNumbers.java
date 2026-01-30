package day0_FastTrack.loops;

import java.util.Scanner;

public class FibonacciNumbers
{
    //fibonacci numbers

    public static void main(String[] args)
    {
        int sum =0;
        int sum1= 0;
        int sum2 =1;
        for (int i =0; i<5; i++)
        {
           sum = sum1 + sum2;
           sum1 = sum2;
           sum2 = sum;

            System.out.println(sum);
        }

//        System.out.println("Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        fibonacciNumber(num);

    }

    public static void fibonacciNumber(int num)
    {
        int num1= 0;
        int num2= 1;
        int sum = 0;

        for (int i=1; i< num; i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(num);
    }
}
