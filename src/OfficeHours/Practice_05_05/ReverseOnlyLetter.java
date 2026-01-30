package OfficeHours.Practice_05_05;

import java.util.Scanner;

public class ReverseOnlyLetter
{
    /*
        Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

        Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
        reverse the string in a way that special characters are not affected.

        Input:   str = "a,b$c"
        Output:  str = "c,b$a"
        Note that $ and , are not moved anywhere.
        Only subsequence "abc" is reversed.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));
        // e d c b A



    }

    public static String reverseNoSpec(String str) {

        char[] letters = str.toCharArray(); //[e, d, ,, c, ,, b, A, !, $]
        // System.out.println(Arrays.toString(letters));

        for(int i=0, j = letters.length-1; i <= letters.length/2; i++){

            if(Character.isLetter(letters[i]))
            {
                for( ; j >= 0 ; j--){
                    if(Character.isLetter(letters[j])){
                        char temp = letters[i];
                        letters[i] = letters[j];
                        letters[j--] = temp;
                        break;
                    }
                }
            }
        }

        //return Arrays.toString(letters).replace("[", "").replace("]", "").replace(", ", "");
        return String.valueOf(letters);
    }
}
