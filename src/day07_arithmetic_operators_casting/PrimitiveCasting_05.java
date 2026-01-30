package day07_arithmetic_operators_casting;

public class PrimitiveCasting_05
{
    public static void main(String[] args)
    {
        int num1 = 100;
        byte b1 =(byte)num1;
        short shNum=(short)num1;
        long lNum1 =num1;   // Convert etmemize gerek yok cunku long en buyuk oldugu icin
        System.out.println(num1);     //Kucukten buguge convert edemiyoruz ama buyukten kucuge yapabiliyoruz.
        System.out.println(b1);
        System.out.println(shNum);
        System.out.println(lNum1);


    }
}
