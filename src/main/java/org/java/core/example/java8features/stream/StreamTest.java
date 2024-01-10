package org.java.core.example.java8features.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Class to demonstrate the Static method Reference and Instance method reference on Stream
* */
public class StreamTest {

    public static void main(String [] args){

        List<Integer> integerList = Arrays.asList(23,5,2,8,12,6,3);
      //  Predicate<Integer> predicate = t-> t>3;
       // integerList.stream().filter(predicate).sorted().forEach(System.out::println);
       // integerList.stream().filter(t->t>3).sorted().forEach(System.out::println);

        // Use of static method reference
      //  integerList.stream().filter(predicate).sorted().forEach(StreamTest::printOutput);

        //Use of instance method reference
        StreamTest stm = new StreamTest();
      //  integerList.stream().filter(t->t>3).sorted().forEach(stm::printResult);

      //  integerList.forEach(System.out::println);

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

    public static void printOutput(int i){
        System.out.println(i);

    }

    public void printResult(int i){
        System.out.println(i);
    }
}
