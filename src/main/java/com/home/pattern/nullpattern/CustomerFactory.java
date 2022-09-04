package com.home.pattern.nullpattern;

import java.util.Arrays;

public class CustomerFactory {

    public static  final  String[] names = {"Rahim", "Karim", "Babu", "Mridha", "Joe"};


    public static Customer getCustomer(String str) {


       Customer customer = Arrays.stream(names)
                .filter(letter -> letter.equalsIgnoreCase(str))
                .findFirst()
                .map(RealCustomer::new)
                .orElse(null);

       if (customer == null) customer = new NullCustomer();

       return customer;


    }

}
