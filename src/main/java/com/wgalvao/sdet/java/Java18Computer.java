package com.wgalvao.sdet.java;

public class Java18Computer {
    int RAM;
    String GPU;
    String HARDDISK;
    String MOTHERBOARD;

    void showInfo() {
        System.out.println(
                "Show Info: GPU " + GPU + " Harddisk " + HARDDISK + " Motherboard " + MOTHERBOARD + " RAM " + RAM);
    }

    String showSpecs() {
        return "Show Specs: GPU " + GPU + " Harddisk " + HARDDISK + " Motherboard " + MOTHERBOARD + " RAM " + RAM;
    }
}
