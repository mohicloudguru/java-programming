package day0_FastTrack;

import java.util.Scanner;

public class DayOneReview
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first name and the last name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int indexOfSpace = name.indexOf(' ');
        String firstName = name.substring(0,indexOfSpace);
        String lastName = name.substring(indexOfSpace+1);

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
