package day42_arraylist;

import java.util.*;

public class CollectionsUtil
{
    public static void main(String[] args)
    {
        List<Character> letter = new ArrayList<>();
        letter.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letter.size());
        System.out.println(letter);

        Collections.reverse(letter);
        System.out.println("reversed = " + letter);
        //find count of a in lettters
        Collections.frequency(letter, 'a');

        int vCount= Collections.frequency(letter,'v');
        System.out.println("vCount = " + vCount);
        System.out.println("Max char = "+Collections.max(letter));
        System.out.println("Min char = "+Collections.min(letter));

        Collections.reverse(letter);
        System.out.println(Collections.replaceAll(letter, 'a', 'u'));
        Collections.replaceAll(letter, 'i','j');
        System.out.println("After replaceAll = "+letter);

        Collections.sort(letter);
        System.out.println("After sort ="+letter);

        List<Integer> nums= Arrays.asList(2,3,1,34,54,456,24,234,654,3,2,4,3,2,3);

        System.out.println("nums = "+nums);
        Collections.reverse(nums);
        System.out.println("Nums after reverse = "+nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countThrees= Collections.frequency(nums,3);
        System.out.println("countThrees = " + countThrees);

        int count2= Collections.frequency(nums,2);
        System.out.println("count2 = " + count2);

        Collections.replaceAll(nums,3,1);
        System.out.println("after replace All = "+nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = "+nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = "+nums);

    }
}
