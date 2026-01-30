package day19_object_strings;

public class StringLength_04
{
    public static void main(String[] args)
    {
        String firstName = "Gokay";
        System.out.println(firstName);
        System.out.println(firstName + " = " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String name1 = "Murodil and Nadir";
        System.out.println(name1);
        System.out.println("Count: " + name1.length());
        System.out.println("wooden spoon".length());

        String password = "abc123";
        if (password.length() >= 6) {
            System.out.println("valid amazon password");
        } else {
            System.out.println("Password must be at least 6");
        }
    }
}
/*
    LENGTH OF THE STRING
    length() method in STRING lass. return the count of characters in the string.
 */
