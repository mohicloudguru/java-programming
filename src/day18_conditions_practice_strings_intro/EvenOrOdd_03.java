package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class EvenOrOdd_03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scan.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");

        System.out.println("Enter a Number For Fizz or Buzz");
        int number1 = scan.nextInt();
        if (number1 % 3 == 0 && number1 % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number1 % 3 == 0) {
            System.out.println(number1 + "Fizz");
        } else if (number1 % 5 == 0) {
            System.out.println(number1 + "Buzz");
        } else {
            System.out.println(number1);
        }

    }
}

// command + shift + f == Universal search in project
// command + shift + r == Universal search  and replace in project