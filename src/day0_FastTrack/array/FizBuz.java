package day0_FastTrack.array;

public class FizBuz
{
    public static void main(String[] args)
    {
        String result="";
        for (int i=1; i<=30; i++)
        {
            if (i%3==0 && i%5==0)
            {
                result +=" FINRA "+i;
            }else if (i%3==0)
            {
                result += " Fin "+i;
            }else if (i%5==0)
            {
                result +=" RA "+i;
            }else
            {
                result +=i+"  ";
            }
        }
        System.out.println(result);
    }
}
