package OfficeHours.Practice_03_29;

public class MoveFirstWord
{
    public static void main(String[] args)
    {
        String str = "Javascript is a fun language";
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(str.substring(space+1) + " " + firstWord);
    }
}
/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
 */