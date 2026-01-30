package day11_comparison_operators;

public class PrePostIncrementDecrement_01
{
    public static void main(String[] args)
    {
        // PRE-INCREMENT;
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1); //11
        System.out.println("num2 = " + num2); //11

        //POST-INCREMENT

        int num3 = 8;
        int num4 = num3++;
        System.out.println("num3 = " + num3); //9
        System.out.println("num4 = " + num4); //8

        int apple = 5;
        int basket = ++apple; //6 apple in the basket
        System.out.println("apple = " + apple);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi); //16
        System.out.println("kiwiBasket = " + kiwiBasket); //15
        // kiwi++ kiwi assign yaptik fakat baskette koymaya usendim.

        int cars = 5;
        System.out.println(++cars); //6 cars

        int sedans = 10;
        System.out.println(sedans++); //Burda eklemiyor cunku

        int myNumber = 44;
        myNumber++; //45
        System.out.println("myNumber = " + myNumber);
        myNumber = 20;
        System.out.println(++myNumber);

        int myNumberr = 15;
        int yourNumber = ++myNumberr;

        System.out.println("myNumberr = " + myNumberr);   //16
        System.out.println("yourNumber = " + yourNumber); //16

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        //     50  + 23

        //sonra olunca eklemiyor ama once olursa ekliyor
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}


/* Pre INCREMENT: ++ IS BEFORE THE VARIABLE
   For Example: int num1=4;
                int num2= ++num2;
   Variable once gelirse ayni degerde assign yapmis oluyor.

   Post INCREMENT: ++ is placed after the variable name.
   For Example: int num1= 4;
                int num2= num1++;
   Variable sonra gelirse ilk olarak assign ediyor daha sonra artiriyor.
 */

//        Sonra ++ olunca eklemiyor ama once olursa ekliyor
/*
        int a=50;
        int b=22;
        int c=a++ + ++b;
              50  + 23
 */