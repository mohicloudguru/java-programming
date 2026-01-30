package day0_FastTrack.CollectionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPraactice
{
    public static void main(String[] args)
    {
      int[] nums = {2,100,3,45,23,6,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Reverse Order
        String[] words ={"Java","C#","C++","Kotlin","Python","Ruby"};
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        // BinarySearch
        // Array must be sort it for BinarySearch to work, otherwise we get unexpected result
        int[] nums1 ={33,55,123,400};
        Arrays.sort(nums1);
        System.out.println(Arrays.binarySearch(nums1, 400));

        ArrayList list = new ArrayList();
        System.out.println(list.size());
    }
}
