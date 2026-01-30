package day0_FastTrack.methods;

public class OverLoadingMethods
{
    public static void main(String[] args)
    {
       sum(10.2,20);
    }

    static int sum(double b, int a)
    {
        return  (int)b +a;
    }

    static int sum(int b, double a)
    {
        return (int) a + b;
    }
}
/**
 *  Same name(signature)  with different parameters
 */