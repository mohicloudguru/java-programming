package day38_methods;

import java.util.Arrays;

public class StringUtils
{
    public static void main(String[] args)
    {
//     isNullOrEmpty("");
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));


        String word=null;
        //Below line will throw NullPointerException, because we are trying to run a string method on NO STRING/NULL
        // System.out.println(word.toUpperCase());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word ="";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str)
    {
      return  (str==null ||str.isEmpty());
//    word.isEmpty() || word== null ==> Null pointer exception
//    word== null || word.isEmpty() ==> this is good

      /*
- if (str.isEmpty || word == null ){ → this will give NullPointerException
- if(word == null || word.isEmpty()) { → this will be true, NO ERROR
- if(word == null | word.isEmpty()) { → this will give NullPointerException because you are using one pipe which forces the program to check both sides
       */
    }

    public static boolean isPalindrome(String str)
    {
        str=str.toLowerCase();
        boolean isPalindrome=true;

        for (int i=0; i<str.length()/2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length()-1-i))
            {
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }

    public static String reverse(String word)
    {
       String str="";

       for (int i= word.length()-1; i>=0; i--)
       {
           str += word.charAt(i);
       }
       return str;
    }


}
