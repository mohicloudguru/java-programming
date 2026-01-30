package Practice.collection_practice.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Example {
     /*
        HashSet -> Class implements Set
        -> Fast
        -> Efficient to find elements
        -> the values are compared and sorted in the ascending order.
        -> This class also allows the insertion of NULL elements.
     */

    public static void main(String[] args) {

        Set<String> h = new HashSet<String>();

        // Adding elements into the Hashset
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate element
        h.add("India");
        System.out.println(h);

        // removing items from Hashset
        h.remove("Australia");
        System.out.println("Set after removing "+ h);

        // iterating over hash set items
        System.out.println();
        System.out.println("Iterating over set: ");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
