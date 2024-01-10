package org.java.core.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountRepeatedCharacters {
    public static void main(String[] args) {

        //count Character Occurrence of a String using LAMBDA
        CountRepeatedCharacters.countCharOccurrence();

        //count Character Occurrence of a String without LAMBDA
        CountRepeatedCharacters.countCharOccurrenceNoLAMBDA();

    }

    public static void countCharOccurrence(){

        String str = "elephant";

        // Convert the string to a character stream
        Stream<Character> charStream = str.chars().mapToObj(c -> (char) c);

        // Group the characters by their occurrence
        Map<Character, Long> charCountMap = charStream.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Print the character count map
        System.out.println(charCountMap);
    }

    public static void countCharOccurrenceNoLAMBDA(){
        String str = "hello world";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
             System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
