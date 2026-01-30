package day20_string_manipulation;

public class StringContains_03
{
    public static void main(String[] args)
    {
        String company = "Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l"));
        System.out.println(company.contains("j"));

        if (company.contains(" ")) {
            System.out.println("company name with multiple words");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("title check passed");
        } else {
            System.out.println("title check failed");
        }

        String firstName = "gokay";

        if (firstName.contains("o") && firstName.contains("y")) {
            System.out.println("both a && y present");
        } else {
            System.out.println("a || y not present");
        }

        firstName = "Nadir";

        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a || i presented");
        } else {
            System.out.println("not presented");
        }

        String email = "murodil@cybertekschool.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println(email + " valid email");
        } else {
            System.out.println("invalid email");
        }

        // CASE INSENSITIVE
        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }

    }
}

/*
    CONTAINS METHOD IN STRING:
    Checks if string is within the variable value and return false.

    INSENSITIVE
    if (email.toLowerCase().contains("d"))

 */