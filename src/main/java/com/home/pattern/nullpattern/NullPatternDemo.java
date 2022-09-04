package com.home.pattern.nullpattern;

import java.util.List;

public class NullPatternDemo {

    public static void main(String[] args) {
        List.of("Rahim", "Karim", "Julie", "Laura")
                .forEach(name -> {
                    Customer customer = CustomerFactory.getCustomer(name);
                    System.out.println(customer.getName());
                });
    }
}
