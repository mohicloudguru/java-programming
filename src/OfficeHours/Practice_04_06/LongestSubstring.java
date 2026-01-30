package OfficeHours.Practice_04_06;

public class LongestSubstring
{
    public static void main(String[] args)
    {
        String str = "abcdeea";
        String longestSubstring = "";
        String temp = "";

        for(int i=0; i < str.length()-1; i++) {

            temp += str.charAt(i);

            if(str.charAt(i) != str.charAt(i + 1)){

                if(temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }

                temp = "";

            }
        }

        System.out.println("Longest substring: "+ longestSubstring);
    }
}
