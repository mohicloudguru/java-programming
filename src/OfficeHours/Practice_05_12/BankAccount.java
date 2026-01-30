package OfficeHours.Practice_05_12;

public class BankAccount
{
    // instance variable, local variable
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin)
    {
        if (pin ==inputPin)
        {
            return balance;
        }
        return -1;
    }

}
