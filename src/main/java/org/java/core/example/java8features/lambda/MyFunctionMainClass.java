package org.java.core.example.java8features.lambda;


import java.util.function.Function;

/*
* On this class we have demonstrated that how we can use the Functional Interface by Lambda
* in this below example (MyFunction and Function Interface)
* We could notice one thing that we can directly use
* the Interface methods without using the child Class because of LAMBDA expression
* */

public class MyFunctionMainClass {
    public static void main(String [] args){
        //Case 1
       /* MyFunction test = () -> System.out.println("test method executed with lambda");
        test.test();*/

        //Case 2
       /*MyFunction test = ( s)->{
           return s+"hi";
        };
       System.out.println(" returned value "+test.test("hello"));*/

        //Case 3
        MyFunction test = (s1, s2) -> s1 + " : " + s2;
       System.out.println(test.test("Hello","Hi"));

       // Use of Pre defined Function FunctionalInterface of JAVA 8
      Function<Integer,String> result=  ( t)-> "output : "+t;
      System.out.println(result.apply(88));
    }
}
