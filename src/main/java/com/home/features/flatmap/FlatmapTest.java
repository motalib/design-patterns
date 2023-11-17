package com.home.features.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapTest {
    public static void main(String[] args) {


// Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> list = List.of(PrimeNumbers, OddNumbers, EvenNumbers);

        List<Integer> integerList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(integerList);


    }
}
