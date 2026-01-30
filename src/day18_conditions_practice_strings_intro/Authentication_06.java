package day18_conditions_practice_strings_intro;

public class Authentication_06
{
    public static void main(String[] args)
    {
        int last4SSN = 1234;
        int pincode = 1234;

        int expLast4SSN = 1534;
        int expPinCode = 1234;

        if (last4SSN == expLast4SSN && pincode == expPinCode) {
            System.out.println("Authentication successful ");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN || pincode != expPinCode) {
                System.out.println("Last 4 SSN is not match");
                System.out.println("Pin code incorrect");
            }
        }
    }
}