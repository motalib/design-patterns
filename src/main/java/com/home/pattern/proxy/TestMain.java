package com.home.pattern.proxy;

public class TestMain {


    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("abc.jpg");
        proxyImage.displayImage();
        proxyImage.displayImage();
    }

}
