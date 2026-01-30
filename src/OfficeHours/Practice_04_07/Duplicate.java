package OfficeHours.Practice_04_07;

public class Duplicate
{
    public static void main(String[] args)
    {
        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) { // A == C
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }

            checked += str.charAt(i);
        }
    }
}
