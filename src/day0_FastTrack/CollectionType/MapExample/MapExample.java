package day0_FastTrack.CollectionType.MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample
{
    public static void main(String[] args)
    {
        // map store key and value
        // duplicated key is not allowed in map

        Map<String,String> map = new HashMap<>();
        map.put("first_name","Gokay");
        map.put("last_name","Yazar");
        map.put("subject","selenium");
        map.put("location","USA");

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("first_name"));
        System.out.println(map.get("subject"));

        Set<String> keys = map.keySet();
        for (String each : keys)
        {
            System.out.println("Key -----> "+each+" Value is ---> "+map.get(each));
        }


    }
}
