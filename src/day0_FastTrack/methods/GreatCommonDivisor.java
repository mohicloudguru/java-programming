package day0_FastTrack.methods;

public class GreatCommonDivisor
{
    public static void main(String[] args)
    {

    }
    public static void gcd(int a, int b)
    {
        int gcd =1;
        int minNumber = Math.min(a,b);
        for (int divisor =2; divisor <= minNumber; divisor ++)
        {
            if (a % divisor == 0 && b % divisor ==0)
            {
                gcd = divisor;
            }

        }
    }
}
