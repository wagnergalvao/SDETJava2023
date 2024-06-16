package com.wgalvao.sdet.java;

public class Java20AppMethodParameters {
    public static void main(String[] args) {
        Java20Computer computer1 = new Java20Computer();
        computer1.GPU = "Nvidia";
        computer1.HARDDISK = "Seagate";
        computer1.MOTHERBOARD = "ASUS";
        computer1.RAM = 2048;

        System.out.println("System.out.println(computer1.additions(5, 4));");
        System.out.println(computer1.additions(5, 4));
    }
}
