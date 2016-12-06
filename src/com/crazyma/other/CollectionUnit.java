package com.crazyma.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by david on 2016/12/6.
 */
public class CollectionUnit {

    public void testHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"No. 1");
        hashMap.put(2,"No. 2");
        hashMap.put(3,"No. 3");
        hashMap.put(4,"No. 4");

        System.out.println("Get 2 : " + hashMap.get(2));
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        hashMap.put(3,"XDDD");

        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry)iterator.next();
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        hashMap.remove(3);

        Iterator iterator1 = hashMap.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator1.next();
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        System.out.println("contain key 2 : " + hashMap.containsKey(2));
        System.out.println("contain key 3 : " + hashMap.containsKey(3));
        System.out.println("contain value 'No. 4' : " + hashMap.containsValue("No. 4"));
        System.out.println("contain value 'XDDD' : " + hashMap.containsValue("XDDD"));
    }

    public void testHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("David");
        hashSet.add("Cathy");
        hashSet.add("Badu");
        hashSet.add("Savuguas");
        for(String str : hashSet){
            System.out.println("item : " + str);
        }
        System.out.println();
        hashSet.add("XDDD");
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println("item : " + str);
        }

        System.out.println("contain item 'David' : " + hashSet.contains("David"));
        System.out.println("contain item 'haha' : " + hashSet.contains("haha"));

    }

}
