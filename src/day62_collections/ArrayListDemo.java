package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args)
    {
         ArrayList<Integer> nums = new ArrayList<>();
         List<String> cities = new ArrayList<>(); //polymorphism
         Collection<String> school = new ArrayList<>();

         cities.add("McLean"); // add method from Collection or LIst interface
         cities.add("Vienna");
         cities.add("New York");

        System.out.println(cities);

        System.out.println("first city:  " + cities.get(0));
        System.out.println("cities.size() = " + cities.size());
    }
}
