package OfficeHours.Practice_07_27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_FrequencyOfCharacters
{
    /*
    * Create a method that will accept a String and print out the frequency of every character in the String

Hint: use maps to keep track of the frequency. Go through the String using only one loop

Ex:
    Input: "apple"
    Output: Key "a"  = Value  "1"
            p = 2
            l = 1
            e = 1
            Algorithm
       traverse "travel across or through" string element
     */

    public static void main(String[] args) {
        FrequencyTest("apple");
        frequencyOfEachChar("apple");
        FrequencyTest("[&/[53get[()(((");

    }
    public static void FrequencyTest(String str){
        // if I want to keep the insertion order I use LinkedHashMap
        //  Map<Character,Integer> map = new LinkedHashMap<>();

        // it gives compiler order, unforseen order
        //   Map<Character,Integer> map = new HashMap<>();

        // sorts them
        Map<Character,Integer> map = new TreeMap<>();


        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)){
                map.put(each,map.get(each) + 1);
            }else{
                map.put(each,1);
            }
        }

        System.out.println(map);
    }

    public static void frequencyOfEachChar (String str){
        Map<Character,Integer> letters = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (!letters.containsKey(key)){
                letters.put(key,0);
            }

            letters.put(key,letters.get(key) + 1);

        }

        System.out.println(letters);
    }
}