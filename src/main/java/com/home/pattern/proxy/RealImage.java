package com.home.pattern.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void displayImage() {
        System.out.println(fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading from disk...");
    }
}
