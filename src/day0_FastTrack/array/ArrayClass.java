package day0_FastTrack.array;

public class ArrayClass
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,2,5,63,12,43,65};


        for (int i =0; i<arr.length; i++)
        {
            int smallestElement = arr[i];
            int smallestElementIndex = i;
            for (int j = i+1; i<arr.length; j++)
            {
                if (smallestElement > arr[j])
                {
                    smallestElement = arr[j];
                    smallestElementIndex = j;
                }
            }
            if (smallestElementIndex != i)
            {
                int temp = arr[i];
                arr[i] = smallestElement;
                arr[smallestElement] = temp;
            }
        }
    }
}
