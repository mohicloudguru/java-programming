package day25_loops;

public class  WhileHungry_01
{
    public static void main(String[] args)
    {
     boolean isHungry=true;
     int bananas=0;
     int countToFull=3;

     while (isHungry)
     {
         bananas++;
         System.out.println("Eating banana = " + bananas);
         if (bananas==countToFull)
         {
             isHungry=false;
         }

     }
        System.out.println("I am full after all bananas "+bananas);
    }
}
/*
    While, and do while loops, can be used with numbers as conditions, or boolean variables,
    boolean statements.

    another type of loop in java is FOR LOOP:
    2 types of FOR LOOP:
        1) for loop with iterator/counter
        2)for each loop-> works with collections, need array topic to learn.

    FOR LOOP -> normally used when we know how many times it will repeat beforehand.
 */