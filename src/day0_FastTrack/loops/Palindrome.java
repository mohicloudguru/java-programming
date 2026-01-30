package day0_FastTrack.loops;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number or a word ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean ispPalindrome =true;

        for (int i=0; i <str.length()/2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length()-1-i))
            {
                ispPalindrome =false;
                System.out.println("It is not palindrome");
                break;
            }
        }
        if (ispPalindrome)
        {
            System.out.println(str);
        }
    }
}
