package Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class LRUCache<k,v> extends LinkedHashMap<k,v>{
    private int capacity;
    LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>capacity;
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(17,0.5f,true);
        linkedHashMap.put("Srija",6701);
        linkedHashMap.put("Harshith",6702);
        linkedHashMap.put("Nihith",6703);
        linkedHashMap.put("Sruthi",6705);

        linkedHashMap.get("Srija"); // it comes at last since LinkedHashMap follows LRU(least recently used technique).
        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for(Map.Entry element:entries){
            System.out.println(element.getKey()+":"+element.getValue());
        }
        System.out.println();

        LRUCache<String,Integer> lruCache=new LRUCache<>(3);
        lruCache.putAll(linkedHashMap);
        Set<Map.Entry<String, Integer>> entries1 = lruCache.entrySet();
        for(Map.Entry element:entries1){
            System.out.println(element.getKey()+":"+element.getValue());
        }
        System.out.println();
        lruCache.put("Harshith",6702);
        lruCache.get("Srija");
        lruCache.get("Sruthi");
        lruCache.get("Srija");

        for(Map.Entry element:entries1){
            System.out.println(element.getKey()+":"+element.getValue());
        }

    }
}
