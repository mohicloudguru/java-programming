package day0_FastTrack.methods;

public class PassingTheValues
{
    public static void main(String[] args)
    {
        int a =10;
        System.out.println("Before invoking the increase method, the value of a: " + a);

        increase(a);

        System.out.println("After invoking the increase method, the value of a: "+a);
    }


    public static void increase(int a)
    {
        a = 20;
        System.out.println("Inside of the increase method, the value of a: "+ a);
    }
}
