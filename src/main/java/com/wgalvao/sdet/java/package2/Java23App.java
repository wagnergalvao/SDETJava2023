package com.wgalvao.sdet.java.package2;

import com.wgalvao.sdet.java.package1.Java23Computer;

public class Java23App {
    public static void main(String[] args) {

        System.out.println("a palavra chave estatica chave pertence a classe Java23Computer");
        System.out.println("importada do pacote com.wgalvao.sdet.java.package1");
        System.out.println("Java23Computer.type exibe a palavra chave estática type");
        System.out.println(Java23Computer.type);

        Java23Computer.type = "Analogic";
        System.out.println("Java23Computer.type = \"Analogic\"; altera de Digital para Analogic");
        System.out.println("Java23Computer.type exibe a palavra chave estática type");
        System.out.println(Java23Computer.type);

    }
}
