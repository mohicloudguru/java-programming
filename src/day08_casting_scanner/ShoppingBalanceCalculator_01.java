package day08_casting_scanner;

public class ShoppingBalanceCalculator_01
{
    public static void main(String[] args)
    {
        double balance=345.55;
        double price1=20.88;
        double price2=89.99;
        double price3=15;

        double remainingBalance=balance-price1-price2-price3;
        //double remainingBalance=(balance-(price1+price2+price3));
        //System.out.println("Your Remaining Balance: $"+remainingBalance);

        System.out.println("Your initial balance: $"+balance);
        System.out.println("Your remaining balance: $"+remainingBalance);

        // Asadaki ornekte gordugumuz gibi kusurat istemedigimiz icin double => int convert ettim
        int balanceWithNoChange =(int)remainingBalance;
        System.out.println("Your remaing balance without cent: $"+balanceWithNoChange);

    }
}
