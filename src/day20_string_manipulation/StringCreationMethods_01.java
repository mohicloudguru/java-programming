package day20_string_manipulation;

import java.lang.*;
import java.util.*;

public class StringCreationMethods_01
{
    public static void main(String[] args)
    {
        String word1 ="imac";
        String word2 =new String("macbook");
        String word3= "";
        String word4= new String();


        System.out.println("\"java\" = " + "java");


        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
    }
}
/*
    Scanner -> import.java.util.Scanner;
    String  -> AUTO import java.lang.String

    Scanner import:
        -> import java.util.Scanner;
        -> import java.util.*;
        -> import all classes from java.util.package
    * -> mean everything
    When we use .* , it does not mean that all imported classes are loaded to our program

    String -> it is a class, but we never had to import it.
    For EX:
    System.out,println();
    System is also a class, but we never had to import it.


    java.lang and java.util are packages
    * means import all classes.

    import java.lang.*;
    import java.util.*;
 */