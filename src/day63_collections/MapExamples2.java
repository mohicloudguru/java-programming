package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {

        // id, Person
        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(null, new Person("", 0));
        map.put(12 , new Person("Nick", 10));

        System.out.println(map.get(31)); // null
        System.out.println(map.get(null)); // Person{name='', age=0}
        System.out.println(map.get(32)); // Person{name='MJ', age=32}

        System.out.println(map);


        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32, new Person("MJ", 32));
        map2.put(null, new Person("", 0));
        map2.put(12 , new Person("Nick", 10));
        System.out.println(map2);

        Map<Integer, Person> map3 = new TreeMap<>();
        map3.put(32, new Person("MJ", 32));
        map3.put(0, new Person("", 0));
        map3.put(12 , new Person("Nick", 10));
        System.out.println(map3);

    }
}

/*
Collections 2 | July 18th 2021
________________________________________________________________

Java Programming day 63

LAST DAY OF JAVA!!!!

Look at where you are at today compared to yourself on java day 1
________________________________________________________________

List → ordered collection of data, uses indexing, and allows duplicates

Set → unique collection of data, does not allow duplicates, no indexing and no ordering

Queue → collection of data in FIFO or LIFO format

    FIFO → First In first Out

    LIFO → Last in first out

Map → collection of data with K(key) + V(value) format. Value maps to the key

________________________________________________________________

Set

    Set interface: unordered, which means there is no indexes. Does not allow duplicate elements

    HashSet: Class that implements Set
        -> based on an algorithm that is fast and efficient to find elements

    LinkedHashSet: implements Set.
        -> maintains insertion order

    TreeSet: implements SortedSet
        -> stores elements into their natural order (lexicographical)(Ascending order). Also has additional methods for searching

    -- If you want to remove an element in a loop from a Set you would need to use an Iterator

________________________________________________________________

Map: an interface that works in key/value format

    in maps every key/value pair is called entry. A key is linked to a value
        -> Keys are unique
        -> Values can be duplicate

        Map < keyDatatype, valueDatatype > refName = new HashMap<>();

    HashMap: implements Map. Based on an algorithm that is fast and efficient to find elements. The order of entries is not guaranteed. Allow one null key

        - Common methods:
            map.put(key, value)
            map.get(key)
            map.remove(key)
            map.containsKey(key)
            map.containsValue(value)
            map.size()
            map.keySet()

    LinkedHashMap: still key/value format. Maintain insertion order of the entries

    TreeMap: Implements the SortedMap interface. The keys will be maintained in natural order (Ascending order). Cannot have a null key


    - What is the difference between HashMap and HashTable?

        HashTable is thread-safe/ Synchronized. HashMap is not thread-safe/ Synchronized.
        HashTable does not allow null keys, but HashMap allows one null key


    - What is the difference between HashMap and TreeMap
        HashMap order is not maintained, but TreeMap the keys are sorted.
        HashMap allows a null key. TreeMap does not allow a null key
        Neither of these is synchronized.
 */