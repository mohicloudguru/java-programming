package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods_02 {
    public static void main(String[] args) {
        String word = "woo den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.toUpperCase().replace(" ", ""));

        String city = "chicago";

        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1));

        String mountain = "kAbul";
        String capitalized = mountain.substring(0, 1).toUpperCase() + mountain.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

    }
}
