package com.wgalvao.sdet.java;

public class Java18AppObjectsAndClasses {
    public static void main(String[] args) {
        Java18Computer computer1 = new Java18Computer();
        computer1.GPU = "Nvidia";
        computer1.HARDDISK = "Seagate";
        computer1.MOTHERBOARD = "ASUS";
        computer1.RAM = 2048;
        System.out.println("GPU         " + computer1.GPU);
        System.out.println("Harddisk    " + computer1.HARDDISK);
        System.out.println("Motherboard " + computer1.MOTHERBOARD);
        System.out.println("RAM         " + computer1.RAM);
    }
}
