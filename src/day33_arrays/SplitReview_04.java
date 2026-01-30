package day33_arrays;

import java.util.Arrays;

public class SplitReview_04
{
    public static void main(String[] args)
    {
        // Note: please do not use this approach to count occurrence of character
        String word = "java";
        String[] wordArray = word.split("a");
        System.out.println(wordArray.length);

        int countA = wordArray.length - 1;
        ;
        if (word.endsWith("a")) {
            countA++;
        }
        System.out.println("countA = " + countA);

        System.out.println("----- SPLIT WITH EMPTY STRING -----");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String str = "java1html2sql";
        String[] strArray = str.split("\\d");
        System.out.println(Arrays.toString(strArray));

        //REPLACEALL is replace all number with _
        str = str.replaceAll("\\d", "_");
        System.out.println("str = " + str);

        String password = "bcTd123_5";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
/*
Split method in java, is more powerful than we used so far.
it accepts REGULAR EXPRESSION as well

REGULAR EXPRESSION(RegEx) ==> is a pattern based matching technique.
 */