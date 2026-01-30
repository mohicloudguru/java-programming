package Practice.collection_practice.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex
{
    /*
        The map is an interface that works in key/value
            -> Every key/value pair called entry
            -> Keys are unique
            -> Values can be duplicate
     */

    public static void main(String[] args) {
     /*
        HashMap
            HashMap is a class implement Map
                -> It is fast and efficient to find element
                -> Order of entries is not guaranteed
                -> Allow one null key
                -> Adding element to the map, we can use the put()
     */
        Map<Integer, String> hm1 = new HashMap<>();
        Map<Integer, String> hm2 = new HashMap<Integer, String>();

        //inserting the element
        hm1.put(1,"Geeks");
        hm1.put(2,"For");
        hm1.put(3,"Geeks");

        hm2.put(new Integer(1),"Geeks");
        hm2.put(new Integer(2),"Geeks");
        hm2.put(new Integer(3),"Geeks");
        hm2.put(new Integer(4),"Geeks");

        System.out.println(hm1);
        System.out.println(hm2);

        // Changing elements -> after adding element if i want to change, it can be done by again adding the element
        hm2.put(new Integer(2),"For");
        System.out.println("Updated Map " + hm2);

        // Removing element
        hm2.remove(new Integer(4));
        System.out.println(hm2);
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("Gokay",10);
        map.put("Sachin",30);
        map.put("vaibhav",20);

        for (Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + "  " + e.getValue());
        }
    }
}
