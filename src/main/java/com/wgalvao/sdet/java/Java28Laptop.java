package com.wgalvao.sdet.java;

public class Java28Laptop extends Java28Computer {

    @Override
    public void start() {
        System.out.println("Classe Laptop iniciada");
    }

    @Override
    public void showInfo() {
        System.out.println("Método showInfo() da classe Laptop é carregado");
    }

}
