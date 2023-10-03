package com.wgalvao.sdet.java.package1;

public class Java23App {
    public static void main(String[] args) {
        Java23Computer computer = new Java23Computer();

        computer.gpu = "Nvidia";
        System.out.println("computer.gpu = \"Nvidia\";");
        System.out.println("computer.harddisk não permite alteração por ser private em Java23Computer");
        System.out.println("computer.motherboard não permite alteração por ser private em Java23Computer");
        System.out.println("computer.ram não permite alteração por ser private em Java23Computer");

        System.out.println("Java23Computer.type exibe a palavra chave estática type");
        System.out.println(Java23Computer.type);

        Java23Computer.type = "Analogic";
        System.out.println("Java23Computer.type = \"Analogic\"; altera de Digital para Analogic");
        System.out.println("Java23Computer.type exibe a palavra chave estática type");
        System.out.println(Java23Computer.type);

    }
}
