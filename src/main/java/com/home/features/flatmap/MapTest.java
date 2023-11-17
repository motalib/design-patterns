package com.home.features.flatmap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(3, 4);
        map.put(2, 2);

        System.out.println(map);

    }
}
