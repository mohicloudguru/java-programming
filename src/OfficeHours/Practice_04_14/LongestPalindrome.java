package OfficeHours.Practice_04_14;

public class LongestPalindrome
{
    /**
     [IQ] Longest Palindrome
     Given a String array. Find the longest Palindrome String in your array.
     Ex:
     Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
     Ex:
     Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
     Output: No palindrome
     */
    public static void main(String[] args)
    {
//        String[] words = {"java"};
//        String longestPalindrome = "";
//
//        for (String word : words) {
//
//            boolean isPalindrome = true;
//
//            for (int i = 0; i < word.length() / 2; i++)
//            {
//                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//                    isPalindrome = false;
//                    break;
//                }
//            }
//
//            if (isPalindrome && word.length() > longestPalindrome.length()) {
//                longestPalindrome = word;
//            }
//
//        }
//
//        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String wordsReversed = "";

        for(int i = 0; i < words.length; i++){
            for (int j = words[i].length()-1; j>=0 ; j--) {
                wordsReversed+=  words[i].charAt(j);
            }
            wordsReversed += ", ";
        }

        String[] reversedArr = wordsReversed.split(", ");
        String palindromes = "";


        for(int i=0; i < words.length; i++){
            if(words[i].equals(reversedArr[i])){
                palindromes += words[i] + ", ";

            }
        }
        if(palindromes.equals("")){
            System.out.println("no palindromes");
        }

        String[] palindromesArr = palindromes.split(", ");
        String maxLengthOne = "";

        int max= palindromesArr[0].length();
        for (int i=0; i < palindromesArr.length; i++){
            if(palindromesArr[i].length() > max){
                max = palindromesArr[i].length();
                maxLengthOne = palindromesArr[i];
            }
        }
        System.out.println(maxLengthOne);
    }
}


