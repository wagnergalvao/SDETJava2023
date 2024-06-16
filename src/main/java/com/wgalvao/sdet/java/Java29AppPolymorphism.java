package com.wgalvao.sdet.java;

public class Java29AppPolymorphism {
    public static void main(String[] args) {

        System.out.println("Java29Computer computerPhone = new Java29Phone();");
        Java29Computer computerPhone = new Java29Phone();
        System.out.println("O comando computerPhone.start();");
        System.out.println("Executa o método start da classe Java29Phone");
        computerPhone.start();
        System.out.println("O comando computerPhone.showInfo();");
        System.out.println("Executa o método showInfo da classe Java29Phone");
        computerPhone.showInfo();
        System.out.println();
        System.out.println("Java29Computer computerLaptop = new Java29Laptop();");
        Java29Computer computerLaptop = new Java29Laptop();
        System.out.println("O comando computerLaptop.start();");
        System.out.println("Executa o método start da classe Java29Laptop");
        computerLaptop.start();
        System.out.println("O comando computerLaptop.showInfo();");
        System.out.println("Executa o método showInfo da classe Java29Laptop");
        computerLaptop.showInfo();
        System.out.println();
        System.out.println("Java29Computer computerTablet = new Java29Tablet();");
        Java29Computer computerTablet = new Java29Tablet();
        System.out.println("O comando computerTablet.start();");
        System.out.println("Executa o método start da classe Java29Tablet");
        computerTablet.start();
        System.out.println("O comando computerTablet.showInfo();");
        System.out.println("Executa o método showInfo da classe Java29Tablet");
        computerTablet.showInfo();
        System.out.println();

    }
}
