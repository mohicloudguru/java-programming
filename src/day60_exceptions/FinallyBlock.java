package day60_exceptions;

import java.util.*;

public class FinallyBlock
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);

       try {
           System.out.println("Enter a number");
           int num = scan.nextInt();
           System.out.println("You entered " + num);
           System.exit(0);// stop java all together, finally block will not run or our jvm crash
       }catch (InputMismatchException e){
           System.out.println("you entered Invalid value!");
       }finally {
           scan.close();// close and clean up the scanner
           System.out.println("Finally block - runs always");
       }

    }
}
/*
 * IQ : final finally finalize what are difference between these words?
    final is keyword:
            final variable -> constant variable, cannot change value after assignment
            final method -> cannot be overridden in sub class
            final class -> cannot be extended to a sub class/ not inherited finally is a block
    it is used with exception handling in java:
      -> code in finally block run always, even if there is or no error in try block
      -> only time finally block code does not run is - where we have
            System.exit(0) statement in try or catch blocks.
      -> or java jvm crashes

     final

 */