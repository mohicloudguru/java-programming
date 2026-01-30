package OfficeHours.Practice_03_23;

import java.util.Scanner;

public class NestedWithScanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }
        } else {
            System.out.println("Enter a character");
            char letter = input.next().charAt(0);

            if (letter >= 'A' && letter <= 'Z') {
                System.out.println(letter + " is a uppercase letter");
            } else if (letter >= 'a' && letter <= 'z') {
                System.out.println(letter + " is a lowercase letter");
            } else {
                System.out.println("Not a valid letter");
            }
        }

/*
[Character Checker]
Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
'G' --> uppercase 'O' --> uppercase
 */

    }
}
