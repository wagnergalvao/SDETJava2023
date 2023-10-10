package com.wgalvao.sdet.java;

public class Java27Laptop extends Java27Computer {

    @Override
    public void start() {
        System.out.println("Classe Laptop iniciada");
    }

    @Override
    public void showInfo() {
        System.out.println("Método showInfo() da classe Laptop é carregado");
    }

}
