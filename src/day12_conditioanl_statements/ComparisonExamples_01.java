package day12_conditioanl_statements;

public class ComparisonExamples_01
{
    public static void main(String[] args)
    {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit); //false
        System.out.println(speedLimit < currentSpeed); //false
        System.out.println(speedLimit == currentSpeed); //false

        boolean isSpeeding = currentSpeed > speedLimit; //false
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        // 45 +20   =65
        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford? " + (accountBalance >= itemPrice));//true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I Afford = " + canAfford);

        //decrease balance by itemPrice using a shorthand operators
        //accountBalance= accountBalance-itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? = " + isBroke);
    }
}
