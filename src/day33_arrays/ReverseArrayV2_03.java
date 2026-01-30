package day33_arrays;

import java.util.*;

public class ReverseArrayV2_03
{
    public static void main(String[] args)
    {
//      int num1= 10;
//      int num2= 30;
//        System.out.println("num1= "+num1);
//        System.out.println("num2= "+num2);
//      //swap those using additional variable
//        int temp=num1;
//        num1=num2;
//        num2=temp;
//
//        System.out.println("num1= "+num1);
//        System.out.println("num2= "+num2);
//
//        int nums[]={5, 10, 4, 100};
//        System.out.println("before swap: "+Arrays.toString(nums));
//
//        temp= nums[0];
//        nums[0]= nums[3];
//        nums[3]=temp;
//        System.out.println("after 1st and last swap: "+Arrays.toString(nums));

        int nums2[] = {5, 10, 4, 100, 6, 3, 7};

        //yarisina bakmamiz yeterli tamamina bakmamiza gerek yok
        System.out.println("Before: " + Arrays.toString(nums2));

        for (int i = 0; i < nums2.length / 2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));
        System.out.println();

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("Before: " + Arrays.toString(words));

        for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("After: " + Arrays.toString(words));
    }
}
