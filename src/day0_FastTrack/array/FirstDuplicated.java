package day0_FastTrack.array;

public class FirstDuplicated
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,2,5,63,12,43,65};
        System.out.println(firstDuplicatedMethod(arr));
    }

    public static int firstDuplicatedMethod(int[]arr)
    {
        int firstDuplicated =0;

        for (int each: arr)
        {
            int count =0;
            for (int each2 : arr)
            {
                if (each == each2)
                {
                    count++;
                }
            }
            if (count >1)
            {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }
}
