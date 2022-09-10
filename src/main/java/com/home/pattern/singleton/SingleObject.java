package com.home.pattern.singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void displayMessage() {
        System.out.println("singleton demo");
    }
}
