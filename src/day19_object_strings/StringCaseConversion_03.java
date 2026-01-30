package day19_object_strings;

public class StringCaseConversion_03
{
    public static void main(String[] args)
    {
        String word = "CyberTek";
        String sentence = "Java is FUN!";

        // toLowerCase()
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());


        // toUpperCase()
        System.out.println(word.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println(sentence.toUpperCase());

        //it is not going to change Unless we assign
        word.toLowerCase();
        System.out.println(word);


        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        // change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toLowerCase());
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //CHANGE Company "Amazon" to "AMAZON"
        company = company.toUpperCase();
        System.out.println("company = " + company);
        company = company.toLowerCase();
        System.out.println("company = " + company);


    }
}

/*
    STRING CASE CONVERSION METHODS:

    toLowerCase() -> converts all letters to lowercase
    toUpperCase() -> converts all letters to uppercase


 */

