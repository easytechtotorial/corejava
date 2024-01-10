package org.java.core.example.string;

public class StringCheckMainClass {
    public static void main(String [] args){

        System.out.println("Main Class");

        StringCheck stringCheck = new StringCheck();
        //String reverse using StringBuilder
        stringCheck.reverse();
        //String reverse using Lambda function
        stringCheck.reverseUsingLambda();
        //String reverse using loop
        stringCheck.reverseUsingLoop();

    }

}
