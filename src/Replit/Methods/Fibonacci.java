package Replit.Methods;
import java.util.*;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num)
    {
        int first=0;
        int second=1;
        int sum=0;


//        for (int i=1; i<num; i++)
//        {
//                sum=first+second;2
//                first=second;
//                second=sum;
//
//        }
//        System.out.print(sum);

        int i=1;
        while (i<num)
        {
            sum=first+second;
               first=second;
               second=sum;
               i++;
        }
        System.out.println(sum);


    }
}
/*
Complete a method fib() that will compute Fibonacci numbers

In the Fibonacci series, the next number is the sum of previous two numbers.
For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc...
The first two numbers of the Fibonacci series are 0 and 1.
(Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.
 */
