package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList
{
    public static void main(String[] args)
    {
        // bu sekilde yaptigimizda istegim gibi ekliyorum  .add yapamiyoruz unsupported operation uyarisi geliyor.
        List<Integer> nums = Arrays.asList(23,1,34,54,324);
        System.out.println("nums = " + nums);

        /*
        Asagida gordugumuz gibi UnsupportedOperationException hatasi veriyor
        sebebi is when we ise Arrays.asList it will return immutable list, that size cannot be modified.
        nums.add(100);
        nums.remove(0);
        System.out.println("nums = " + nums);
         */

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(321);
        numsList.add(245);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(1);
        // new Integer yazdigimizda istegimiz sayiyi degeri remove yapabilirz
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        /*
        List String drinksWithCaffeine => coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
        int caffeineAmount=0;
        monster, red bull, celsius:
        caffeineAmount=150;
        coffee, kambucha:
        caffeineAmount=112
        tea, coke, Pepsi, mdew:
        caffeineAmount=35;
         */
        List<String> drinksWithCaffeine= new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull","coke","pepsi","mdew","kambucha", "celsius" ));
        int caffeineAmount=0;
        System.out.println(drinksWithCaffeine);
        for (String each: drinksWithCaffeine)
        {
          if (each.equals("monster") || each.equals("red bull")|| each.equals("celsius"))
          {
              caffeineAmount=150;
              System.out.println(each+" caffeine amount is = "+caffeineAmount);
          }
          else if (each.equals("coffee")||each.equals("kambucha"))
          {
              caffeineAmount=112;
              System.out.println(each+" caffeine amount is = "+caffeineAmount);
          }
          else if (each.equals("tea")||each.equals("coke")||each.equals("mdew"))
          {
              caffeineAmount=35;
              System.out.println(each+" caffeine amount is = "+caffeineAmount);
          }
        }
        System.out.println();
        for(String drink:drinksWithCaffeine)
        {
            switch (drink)
            {
                case "monster": case "redbull": case "celcius":
                caffeineAmount = 150;
                break;
                case "cofee": case "kambucha":
                caffeineAmount =112;
                case "tea": case "coke": case "pepsi":
                caffeineAmount = 35;
                break;
            }
            System.out.println(drink+ " = " + caffeineAmount);
        }

        // We do not need to mention data type
        // -> Lambda expression
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
       // if we want to do more thing, we need a curly braves
        drinksWithCaffeine.forEach(drink ->{
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });

        List<Integer> nums1= Arrays.asList(2,4,5);
        nums1.forEach(n -> System.out.println(n*n) );




    }
}
/**
Arrays class => is a utility class for arrays, it contains many useful methods.
EX:
    sort, toString, equals, binarySearch
asList() is another method is Arrays class.
    It will convert an array to arrayList

How to create and assign values to ArrayList in 1 statement.
1) List<Double> nums1= Arrays.asList(23.3, 54.1, 2.2);
    Disadvantage:
            nums1 is fixed size, cannot change the size by adding or removing values.
            It will only work for any other ArrayList methods:
            add, remove, clear => cannot be used
            contains, get, isEmpty, or any other methods that does not change the size==> can be used.
2) List<Double> nums2 = new ArrayList<>(Arrays.asList(23.3, 54.1, 2.2);
Now nums2 is resizable and can use any methods.

 */

/**
It is another way of looping Arraylist, we need to use LAMBDA EXPRESSION ( -> ) to specify action to do
with elements in list.

Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and
returns a value.
Lambda expressions are similar to methods,
but they do not need a name and they can be implemented right in the body of a method.
 */