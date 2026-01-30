package OfficeHours.Practice_04_06;

public class Palindrome
{
    public static void main(String[] args)
    {
        // Q: What if your String has a million characters
        String word = "civic";
        boolean isPalindrome = true;

        for(int i=0; i < word.length()/2; i++) {

            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
