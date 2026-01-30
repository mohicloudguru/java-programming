package Practice.collection_practice.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Ex
{
    /*
        LinkedHashMap
            -> key/ value format
            -> insertion order of entries
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        for (Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " "+ e.getValue());
        }
    }
}
