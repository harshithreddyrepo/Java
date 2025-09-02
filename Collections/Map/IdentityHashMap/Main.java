package Collections.Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Main {
    public static void main(String[] args) {
        String key1=new String("key1");
        String key2=new String("key1");
        String key3=new String("key2");

        IdentityHashMap<String,Integer> hashMap=new IdentityHashMap<>();
        hashMap.put(key1,1);
        hashMap.put(key2,2);
        hashMap.put(key3,3);

        System.out.println(hashMap.size());
        System.out.println(hashMap);
    }
}
