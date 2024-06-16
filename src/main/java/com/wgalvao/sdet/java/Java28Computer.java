package com.wgalvao.sdet.java;

public class Java28Computer implements Java28Info {
    private int id = 1;

    public void start() {
        System.out.println("Computador iniciado");
    }

    public void showInfo() {
        System.out.println("ID do computador é " + id);
    }

}
