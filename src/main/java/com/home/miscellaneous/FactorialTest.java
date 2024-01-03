package com.home.miscellaneous;

import javax.swing.*;
import java.awt.*;

public class FactorialTest {

    JTextArea outputArea;

        public void init() {
        outputArea = new JTextArea();
        Container container = new Container();
        container.add(outputArea);

        for(long counter = 1; counter <= 10; counter++) {
            outputArea.append(counter + "!=" + factorial(counter) + "\n");
        }
    }

    private static long factorial(long counter) {
        if(counter <=1) return 1;
        return counter * factorial(counter - 1);
    }


    public static void main(String[] args) {

        FactorialTest factorialTest = new FactorialTest();
        factorialTest.init();

      StringBuilder  outputArea = new StringBuilder();
        for(long counter = 1; counter <= 10; counter++) {
            outputArea.append(counter).append("!=").append(factorial(counter)).append("\n");
        }

        System.out.println(outputArea.toString());
    }

}
