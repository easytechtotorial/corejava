package org.java.core.example.java8features.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionTest {

    public static void main(String [] args){

        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Asutosh");
        hashMap.put(2,"Santu");
        hashMap.put(3,"Tami");
        hashMap.put(4,"bindu");
        hashMap.put(5,"Benz");

        // hashMap.entrySet().forEach(t->System.out.println(t));

        // hashMap.values().forEach(t-> System.out.println(t));

        // hashMap.entrySet().stream().filter(entry->entry.getKey()>2).forEach(System.out::println);

        Map<Integer, String> collect = hashMap.entrySet().stream().filter(entry -> entry.getKey() > 2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Print the value from Map where key greater than 2 :"+collect);

    }

}
