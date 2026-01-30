package day0_FastTrack.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz
{
    public static void fizzBuzz(int num)
    {
        for(int i=1; i<=num; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FIZZBUZZ");
            }else if (i%3==0)
            {
                System.out.println("Fizz");
            }else if (i%5==0)
            {
                System.out.println("buzz");
            }else
            {
                System.out.println(i);
            }
        }
    }

    public List<String> fizzBuz(int n)
    {
        List<String> result = new ArrayList<>();
        for (int i=1; i<=n; i++)
        {
            if (i%3==0 && i%5==0)
            {
                result.add("FizzBuz");
            }else if (i%3==0)
            {
                result.add("Fizz");
            }else if (i%5==0)
            {
                result.add("Buzz");
            }else
            {
                result.add(i+"");
            }
        }
        return result;

    }

    public List<String> fizzBuzzz(int n) {
        List<String> result = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        for (int i = 1;i<=n;i++){
            String ansString = "";
            for (Integer key : map.keySet())
                if (i % key == 0) ansString += map.get(key);
            if (ansString.equals("")) ansString += i;
            result.add(ansString);
        }
        return result;
    }

    public static void main(String[] args)
    {
        fizzBuzz(100);
    }
}
