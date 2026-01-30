package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV2_02
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you? ");
        // Scanner is non- primitive, object type, class type for example like String
        // next() => used to input string, single world, until space
        // nextLine() => used to input whole sentence

        int age = scan.nextInt();
        System.out.println(age + " That is great age!!");
        scan.close();

        // Scanner class give us a capability to pass values/inputs into our java programs.
        // interactive way

    }
}
