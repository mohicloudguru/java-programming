package OfficeHours.Practice_03_24;

public class CharIndex
{
    public static void main(String[]args)
    {
        String s="java";
        //        0123
        // charAt(4) -> exception
       // System.out.println(s.charAt(s.length()));// this is error not possible
        System.out.println(s.charAt(s.length()-1)); //a

        // charAt print each

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        String upper =""+s.toUpperCase().charAt(0)+s.toUpperCase().charAt(3);
                    // method chaining
                    // "" beginning we use because taking number so that's why has to concatenation
        System.out.println(upper);

        System.out.println(s.indexOf('a'));// this give first a
        System.out.println(s.indexOf('m'));//-1

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j')>=0? "Contains": "Not contains");
        System.out.println(s.indexOf('g')>=0? "Contains": "Not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));

        // we can do chain more than 2 as long as String
        System.out.println(s.toUpperCase().replace("a","e").startsWith("a"));
    }
}

/*
    Index

    java is
    0123456

    charaAt(number) -> gives a char
    indexOf(char)   -> gives a number  This is opposite with charAt
 */