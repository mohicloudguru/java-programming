package day33_arrays;

import java.util.Arrays;

public class ReverseArrayV1_02
{
    public static void main(String[] args)
    {
        int nums[] = {5, 10, 4, 100};
        int numsRev[] = new int[nums.length];

        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));
    }
}
/*
    Whenever need, we can use 2 variables with for Loop
 */