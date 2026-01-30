package day0_FastTrack.CollectionType.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(null);
        list.add(321);

        System.out.println(list);

    }
}
