package day0_FastTrack.methods;

public class PalindromePrimes
{

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }



    //TODO
    // write a function that returns if a number is palindrome or not



//    static boolean isPalindrome(int number)
//    {
//        String str = number+"";
//        boolean isPalindrome = false;
//        for (int i=0; i<str.length()/2; i++)
//        {
//            if (str.charAt(i) != str.charAt(str.length()-1-i))
//            {
//                isPalindrome =false;
//                System.out.println("It is not a palindrome");
//                break;
//            }
//        }
//        if (isPalindrome)
//        {
//            return true;
//        }else
//            return false;
//    }

    static boolean isPalindrome(int number)
    {
        String str = number+"";
        boolean isPalindrome = false;
        int low = 0;
        int high = str.length() -1;

        for (int i=0; i<str.length()/2; i++)
        {
            if (str.charAt(low) != str.charAt(high))
            {
                isPalindrome = false;
                System.out.println("It is not a palindrome ");
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
        {
            return true;
        }
        else
        return false;
    }

    //write a function that returns if a number is prime or not
    static boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }

        for (int i =2; i< number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    //TODO
    //write a function that returns if a number is palindromic or not
    static boolean isPalindromic(int number)
    {
        return false;
    }
}
