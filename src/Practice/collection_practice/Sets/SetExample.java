package Practice.collection_practice.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample
{
    /*
     Set -> Interface
            Set interface allows user the users to perform the basic mathematical operation on the set.
     -> no index
     -> no duplicated
     -> unordered
     -> Null values are accepted
     */


    public static void main(String[] args) {

        Set<Integer> a = new HashSet<Integer>();
        // addAll is used to append all of the element from the mentioned collection to the existing set
        // elements are added randomly without following any specific order
        a.addAll(Arrays.asList( new Integer[] {1,3,2,4,8,9,0}));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList
                (new Integer[]{1,3,7,5,4,0,7,5}));

        // to find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two set");
        System.out.println(union);

        // to find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two set");
        System.out.println(intersection);

        // to find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference if the two set");
        System.out.println(difference);
        System.out.println();
        System.out.println("--------------");

        Set<String> hs = new HashSet<String>();
        // elements are added using add() method
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println(hs);

        // Check if the above string existing in the SortedSet or not
        // contains method return -> boolean
        String check = "D";
        System.out.println("Contains " + check + " " + hs.contains(check));

        //Removing the elements b
        hs.remove("B");
        System.out.println("After removing element " + hs);
        System.out.println();

        // Iterating though the set
        for (String value: hs) {
            System.out.print(value + "," );
        }


    }
}
