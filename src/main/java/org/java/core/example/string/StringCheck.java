package org.java.core.example.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCheck {
    public void reverse( ){
        System.out.println("Reversing the String Using StringBuilder");

        String name= "Asutosh";
        System.out.println("Name :" +name);
        StringBuilder sb = new StringBuilder(name);
        System.out.println("ReverseName :" +sb.reverse());
    }

    public void reverseUsingLambda(){
        System.out.println("Reversing the String Using Lambda");

        String name= "Asutosh";
        System.out.println("Name :" +name);
        String reverseName = Stream.of(name).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining());
        System.out.println("ReverseName :" +reverseName);
    }

    public void reverseUsingLoop(){
        System.out.println("Reversing the String Using loop");

        String name= "Asutosh";
        System.out.println("Name :" +name);
        String reverseName = "";
        int nameLength = name.length();
        for(int i=nameLength-1; i>=0; i--){
            reverseName = reverseName+name.charAt(i);

        }
        System.out.print("ReverseName :"+reverseName);
    }

}
