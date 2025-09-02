package Collections.Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"apple");
        hashMap.put(2,"banana");
        hashMap.put(3,"grape");
        hashMap.put(5,"cherry");
        hashMap.put(4,"mango");
        System.out.println(hashMap);  // No order maintained.

        // loop over the elements in the map
        Set<Integer> strings = hashMap.keySet();  // returns the key set of the hashmap.
        for(Integer key:strings){
            System.out.println(key+":"+hashMap.get(key));
        }

        Collection<String> values = hashMap.values();  // returns the collection of values.
        System.out.println(values);

        Set<Map.Entry<Integer,String>> entries = hashMap.entrySet(); // returns set of entries in the hashmap.
        // Entry is a static inner class of Map interface.
        for(Map.Entry<Integer,String> entry:entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

    }
}
