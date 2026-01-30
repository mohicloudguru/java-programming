package Replit.Methods;
import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num)
    {
        int reverseNum=0;
        int remainder=0;
        int tem=num;

        while(num>0)
        {
            remainder= num % 10;
            reverseNum= remainder + (reverseNum*10);
            num /= 10;
        }
        System.out.println(tem==reverseNum);

    }
}
/*
Complete the method isPalindrome() that will check if number is a palindrome.
 Print your result as a boolean (true or false).
 */