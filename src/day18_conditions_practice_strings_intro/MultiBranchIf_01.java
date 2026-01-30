package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class MultiBranchIf_01 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is 0");
        }
    }
}
