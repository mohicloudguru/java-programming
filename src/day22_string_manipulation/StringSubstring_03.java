package day22_string_manipulation;

public class StringSubstring_03 {
    public static void main(String[] args)
    {

        /*
            1) word.substring(startIndex, endIndex)
         */

        String word = "java is fun";
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        System.out.println(word.substring(8));

        /*
            2) substring(startIndex)- it will read from start until end
         */

        System.out.println(word.substring(8));
        //print is fun
        System.out.println(word.substring(5));
    }
}
/*
 Substring() String class method

        returns part of the string.

        Her zman ilk numarayi dahil eder ve verilen diger numaraya gelmeden durur.

        2 ways of using substring()

     1) substring (start, end)-> returns part of string from start index until end index.
     end index is not included.
     remember indexes starts from zero

     2) substring(start) -> returns part of string from start index until the last character.
 */