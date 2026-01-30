package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class ScoreRangeTest_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Score");
        int score = scanner.nextInt();

        if (score >= 1 && score <= 40) {
            System.out.println(score + " is D");
        } else if (score >= 41 && score < 60) {
            System.out.println(score + " is C");
        } else if (score >= 61 && score <= 90) {
            System.out.println(score + " is B");
        } else if (score >= 91 && score <= 100) {
            System.out.println(score + " is A");
        } else {
            System.out.println("Invalid number");
        }
    }

}
