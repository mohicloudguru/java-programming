package Practice.collection_practice.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Exa
{
    /*
    TreeMap
        Implement the sortedMap
        -> Maintaining in natural order(Alphabetic or Number)
        -> can not have a null key
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("vishal",10);
        map.put("sachin",30);
        map.put("vaibhav",20);

        for (Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    /*
        I.Q What is the difference between HashMap and HashTable?
            HashTable
                -> tread/safe synchronized
                -> Hash Table does not allow null keys
            HashMap
                -> is not tread/safe synchronized
                -> HashMap allows one null keys

        I.Q Difference between HashMap and TreeMap
                -> HashMap order is not maintained but TreeMap the keys are sorted
                -> HashMap allows a null
                -> TreeMap does not allow null
     */

}
