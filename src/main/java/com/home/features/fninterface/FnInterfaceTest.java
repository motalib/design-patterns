package com.home.features.fninterface;

import java.util.Arrays;
import java.util.List;

public class FnInterfaceTest {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("bob", "josh", "megan");

        names.replaceAll(String::toUpperCase);

        System.out.println(names);


        Thread thread = new Thread(() -> System.out.println("Hello From Another Thread"));
        thread.start();
    }
}
