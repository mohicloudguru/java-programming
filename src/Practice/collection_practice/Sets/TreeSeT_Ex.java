package Practice.collection_practice.Sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSeT_Ex
{
    /*
        TreeSet implementation of the (SortedSet) Interface and SortedSet extends Set interface
            -> natural oder (Alphabetic or Number)
            -> additional method for searching
     */
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<String>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // adding the duplicate
        //element
        ts.add("India");
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
//        ts.remove("Australia");
//        System.out.println("Set after removing "+ts);
        System.out.println();

        // Iterating over Tree set items
        System.out.println("Iterating over set: ");
        Iterator<String> i = ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // additional method for searching
        System.out.println(((TreeSet) ts).first());
    }
}
