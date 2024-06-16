package com.wgalvao.sdet.java;

public class Java21Computer {
    int RAM;
    String GPU;
    String HARDDISK;
    String MOTHERBOARD;
    String processor;

    public Java21Computer() {
        System.out.println("Carregado o construtor Java20Computer");
    }

    public Java21Computer(String processorName) {
        processor = processorName;
    }
}
