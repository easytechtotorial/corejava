package org.java.core.example.java8features.functionalinterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/*
* User defined FunctionalInterface
*
* Definition: An interface that contains only ONE abstract method is
* known as FunctionalInterface, it can have any number of
* default and static methods
*
* BEFORE JAVA 8 Runnable, Callable, Comparator are the FunctionalInterface
* *******************************************
* ON JAVA 8 Introduced FunctionalInterfaces:
*  Function, Predicates, Consumer, Supplier
* *******************************************
* */
@FunctionalInterface
public interface UPIPayment {
    //ONLY ONE Abstract method we can write on FunctionalInterface
    String doPayment(String source, String destination);

    //More than one default method we can write on FunctionalInterface
    default double getScratchCard(){
        return new Random().nextDouble();
    }
    default double getScratchCard1(){
        return new Random().nextDouble();
    }
    //More than ONE static method we can write on Functional Interface
    static String datePatterns(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }

    static String datePatterns1(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }

}
