package com.home.pattern.nullpattern;

import java.util.Arrays;

public class CustomerFactory {

    public static  final  String[] names = {"Rahim", "Karim", "Babu", "Mridha", "Joe"};

    public static Customer getCustomer(String str) {
       return Arrays.stream(names)
                .filter(name -> name.equalsIgnoreCase(str))
                .findFirst()
                .map(name -> (Customer) new RealCustomer(name))
                .orElseGet(NullCustomer::new);
    }
}
