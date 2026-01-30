package day0_FastTrack.CollectionType.SetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args)
    {
       Set<String> set = new HashSet<>();
        set.add("Gokay");
        set.add("Yazar");
        set.add("Selenium");
        set.add("Cucumber");
        set.add("AutomationTools");

        System.out.println(set);

        Set<String> set2 = new HashSet<>();

        /**
         * We can not use tradional loop because there is no index in set\
         * Therefore we need to use foreach loop
         */
//        for (int i=0; i<set.size(); i++)
//        {
//
//        }

        for (String each : set)
        {
            System.out.println(each);
        }



    }
}
