package day0_FastTrack.CollectionType.MapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplicatedExample
{
    public static void main(String[] args)
    {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        List<String> listOfEmails = new ArrayList<>();
        listOfEmails.add("gokay@hotma");
        listOfEmails.add("asdhja@hotma");
        listOfEmails.add("yazar@hotma");

        map.put("email",listOfEmails);
    }
}
