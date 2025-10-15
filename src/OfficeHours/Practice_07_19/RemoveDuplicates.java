package OfficeHours.Practice_07_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates
{
    /*
    * Create a method that will accept a String and returns a String with the duplicate instances of characters removed

Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
     */

    public static String removeDuplicateChars(String str){
        //Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split(""))); // maintain insertion order
        //return set.toString().replace("[","").replace("]","");
        return String.join("",set);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("AAABBBCCCD"));
    }
}
