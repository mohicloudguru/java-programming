package OfficeHours.Practice_03_29;

public class MiddleChar
{
    public static void main(String[] args)
    {
         /*
        [Middle char]
        Given a String, write a program to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
         */

        String word = "apple";
        if (word.length() % 2 == 1) {
            //odd number
            System.out.println(word.charAt(word.length() / 2));
            System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
        } else {
            //even
            int index = word.length() / 2;
            System.out.println(word.charAt(index - 1) + "" + word.charAt(index));
            System.out.println(word.substring(index - 1, index + 1));
            // eger +1 eklemeseydik digerini eklemicekti

        }
    }
}
