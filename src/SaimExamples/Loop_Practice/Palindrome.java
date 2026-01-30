package SaimExamples.Loop_Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String reverse="";
        boolean palindrome=false;

        for (int i=word.length()-1;i>=0;i--)
        {
          reverse +=word.charAt(i);
        }

        if (word.equals(reverse))
        {
         palindrome =true;
        }
        System.out.println(palindrome);
    }

}

/*
[IQ] Palindrome
A word that is the same read forwards and backwards.
 User takes a word from the console. Print true if the word is a palindrome.
 Print false if the word is not palindrome.
-> input: civic -> output: true
-> input: java -> output: false
 */