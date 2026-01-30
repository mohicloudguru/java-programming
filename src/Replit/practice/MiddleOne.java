package Replit.practice;

import java.util.Scanner;

public class MiddleOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int n = word.length();
        if (n % 2 ==0 && n >= 4)
        {
            n = n/2;
            System.out.println(word.substring(n - 1, n + 1));
        }else if (n % 2 == 0 && n==2)
        {
            System.out.println(word +word);
        }else if (n % 2 != 0 && n >=3)
        {
            n = n/2;
            System.out.println(word.substring(n,n+1));
        }
        else {
            System.out.println(word + word + word);
        }
    }
}
