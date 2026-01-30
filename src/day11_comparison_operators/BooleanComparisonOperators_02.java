package day11_comparison_operators;

public class BooleanComparisonOperators_02
{
    public static void main(String[] args)
    {
        System.out.println(10 == 10); //true
        System.out.println(1000 > 100);//true
        System.out.println(501 < 502);//true
        System.out.println(10 <= 11); //true
        System.out.println(10 <= 11);//true
        System.out.println(5 >= 3);
        System.out.println(-100 != 44);//true     != meaning is not equal.

        int a = 100;
        int b = 200;
        System.out.println(a == b); //false
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true
        System.out.println(a != b);//true

        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        result = 88 < 99;
        System.out.println("result = " + result);
        result = 10 >= 10;
        System.out.println("result = " + result);
        result = 123 <= 124;
        System.out.println("result = " + result);
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "NewYork City";
        System.out.println(city == "NewYork City");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

        int age = 66;
        boolean noMoretoddler = age > 3;
        System.out.println("noMoretoddler = " + noMoretoddler);

        boolean seniorCitizen = age >= 65;
        System.out.println("is seniorCitizen? - " + seniorCitizen);

    }
}
