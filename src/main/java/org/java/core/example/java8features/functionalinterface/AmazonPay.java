package org.java.core.example.java8features.functionalinterface;

/*
* AmazonPay class implemented the FunctionalInterface
* Abstract method is mandatory to be overridden if implements the FunctionalInterface
* default method is not mandatory to override
* We can use the static method from the child class
* */
public class AmazonPay implements UPIPayment {

    // Abstract method is mandatory to be overridden if implements the FunctionalInterface
    @Override
    public String doPayment(String source, String destination) {
        // write the method specific code
        return null;
    }

    // default method is not mandatory to override
    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }

    // We can use the static method from the child class
    public String checkDates(){
        return UPIPayment.datePatterns("dd/yy/mm");
    }
}
