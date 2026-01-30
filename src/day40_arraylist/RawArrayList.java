package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList
{
    public static void main(String[] args)
    {
        //Declare raw arraylist
        ArrayList list1=new ArrayList();
        List list2= new ArrayList();

        //Add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println("size = "+list1.size());
    }
}
/*
ArrayList
In programming, we always deal with multiple sets of data. it could be user data like names, emails, addresses, phone numbers etc.
Or it could be product data like product names, categories, statuses, prices, etc. or it could be mixed data, like user history, steps that user does, etc etc.
In order to work with large amounts of data, we use DATA Structures,
 as you can see by name that they help programmatically structure the data so that we can easily work with data.

In java DATA STRUCTURES:
	-> Arrays
	-> Collections Framework:
			-> List - ArrayList
			-> List - LinkedList
			-> Set -> HashSet
			etc
			Maps and other ones that help us structure the data into manageable format.
	So that we can verify, store, delete , update data easy way.

In general Data Structures are there so that we can work with data easily.
They are like tools of a car mechanic.
-----------------------------------------

In Java - Arrays are fixed size, once declared we cannot add or remove elements.
So it has a disadvantage when you work with dynamic or unpredictable sets of data.

This is where ARRAYLIST comes in, it is dynamic sized and we can add and remove elements any time. It is not FIXED size.

IQ: Difference between Array and ArrayList?

Array is fixed size
ArrayList is re-sizable | dynamic size
---------------------------------------

ArrayList -> is a class in java. that is used to store multiple sets of data like array.

1) It keeps index ordering
2) It allows duplicated values
 */

/**
 * Declaring Array list in 2 way
 * 1-     ArrayList list = new ArrayList();
 * 2-     List list2 = new ArrayList();
 */
