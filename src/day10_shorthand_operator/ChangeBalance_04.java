package day10_shorthand_operator;

public class ChangeBalance_04
{
    public static void main(String[] args)
    {
        double balance = 1230.55;
        System.out.println("Balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("Balance after baklava = " + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = " + balance);

        // Second Kunefe is 50% off
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        // Buy it and decrease balance with kenafe price
        balance = balance - kunefe;
        System.out.println("remainingBalance after second kunefe = " + balance);

        double pilav = 7.99;
        System.out.println("plov = " + pilav);
        balance = balance - pilav;
        System.out.println("remainingBalance after pilav = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = $" + icedTea);
        balance = balance - (icedTea * 4);
        System.out.println("remainingBalance after 4 iced teas= " + balance);

        // return baklava
        System.out.println("Returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("remainingBalance after returning baklava= " + balance);


    }
}
