package day08_casting_scanner;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class CastingExamples_02
{
    public static void main(String[] args)
    {
        //                  byte - short- int - long
        //***Asadaki orneklede ki gibi hepsi byte buyuk oldugu icin otomatik convert ediyor***
        byte num1=100;
        short num2=num1;
        int num3 =num1;
        int num4 = 100;
        long num5 = num4;

        // float - double
        //*** double bigger than float so we do not have to convert it.***
        float num6= 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println("num9 = "+num9);//3456.0

        //                  byte- short- int- long
        // Asada gorudugumuz gibi kucukten buyuge yaptigimiz icin CONVERT/CAST yapmamiz gerekiyor
        int num_1 = 55;
        byte num_2= (byte) num_1;

        long num_3= 4444L;
        int num_4 = (int) num3;
        System.out.println("=========");

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println("num10 ="+ num10);
        System.out.println("num11 ="+ num11);
        System.out.println("num12 ="+ num12);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 ="+ num13);
        System.out.println("num14="+ num14);

        double num15= 2124.5;
        int num16 = (int)num15; // decimal number remove.
        System.out.println("num15 ="+ num15);
        System.out.println("num16 ="+ num16);

        int num17=300;
        byte num18= (byte)num17; // larger type
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
        
        // Casting Char to INT
        char letter='G';//97
        int numLetter = letter;
        System.out.println("Letter = " + letter);
        System.out.println("numLetter = " + numLetter);

        // From smaller to larger=> automatic/implicit casting/converting
        // From larger to smaller=> explicit casting, we need to use()

        double d= 20.5;
        short sh= (short)d;
        System.out.println(sh);
    }
}
