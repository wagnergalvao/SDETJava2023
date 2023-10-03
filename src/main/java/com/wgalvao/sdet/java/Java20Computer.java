package com.wgalvao.sdet.java;

public class Java20Computer {
    int RAM;
    String GPU;
    String HARDDISK;
    String MOTHERBOARD;
    String processor;

    public Java20Computer() {
        System.out.println("Carregado o construtor Java20Computer");
    }

    public Java20Computer(String processorName) {
        processor = processorName;
    }
}
