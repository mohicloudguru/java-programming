package Practice.collection_practice.Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx
{
    /*
        LinkedHashSet -> implement sets
            -> maintain insertion order(order works how we create it no index)
        ** Remove element from Set, we need to use iterator
    */

    public static void main(String[] args) {

        Set<String> h = new LinkedHashSet<String>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding the duplicate
        // element
        h.add("India");
        System.out.println(h);

        // removing items from LinkedHashSet
        h.remove("Australia");
        System.out.println("After removing items "+ h);

        // Iterating over linked hash set items
        System.out.println();

        System.out.println("Iterating over set: ");
        // iterator() -> is used to return the iterator of the set. The elements from the set are returned in a random order.
        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
