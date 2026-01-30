package day0_FastTrack.CollectionType.ArrayListExample;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args) {

        // we can add duplicated value
        // size is not fixed
        // ArrayList is class
        // we can add any type of value, primitive type automatically wrap becomes an object because of wrapper class

        ArrayList list = new ArrayList();
        list.add("Gokay");
        list.add(12);
        list.add('G');
        list.add("Gokay");
        System.out.println(list);

        System.out.println("list.get(0) = " + list.get(0));

        System.out.println(list.contains("Gokay"));
        System.out.println(list.size());

        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        for (Object each: list)
        {
            System.out.println(each);
        }
    }
}
