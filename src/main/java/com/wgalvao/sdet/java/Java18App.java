package com.wgalvao.sdet.java;

public class Java18App {
    public static void main(String[] args) {
        Java18Computer computer1 = new Java18Computer();
        computer1.GPU = "Nvidia";
        computer1.HARDDISK = "Seagate";
        computer1.MOTHERBOARD = "ASUS";
        computer1.RAM = 2048;

        System.out.println("computer1.showInfo()");
        computer1.showInfo();

        System.out.println("computer1.showSpecs()");
        computer1.showSpecs();

        System.out.println("String result = computer1.showSpecs();");
        System.out.println("System.out.println(result);");
        String result = computer1.showSpecs();
        System.out.println(result);
    }
}
