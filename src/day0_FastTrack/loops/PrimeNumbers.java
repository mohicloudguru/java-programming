package day0_FastTrack.loops;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int limit = 100;

        for (int i =2; i <= limit; i++)
        {
            boolean isPrimeNumber = true;

            for (int j= 2; j<i; j++)
            {
                if (i % j == 0)
                {
                    isPrimeNumber =false;
                    break;
                }
            }
            if (isPrimeNumber)
            {
                System.out.println(i + " ");
            }
        }

    }
}
