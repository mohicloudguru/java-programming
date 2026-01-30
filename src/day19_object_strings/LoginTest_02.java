package day19_object_strings;

public class LoginTest_02 {
    public static void main(String[] args)
    {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek123";
        String password = "abc1234";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is incorrect");
            } else {
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}