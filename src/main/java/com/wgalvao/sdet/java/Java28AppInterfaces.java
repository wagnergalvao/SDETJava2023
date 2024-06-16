package com.wgalvao.sdet.java;

public class Java28AppInterfaces {
    public static void main(String[] args) {

        System.out.println("Java28Computer computer = new Java28Computer();");
        Java28Computer computer = new Java28Computer();
        System.out.println("computer.start();");
        computer.start();
        System.out.println("computer.showInfo();");
        computer.showInfo();
        System.out.println();
        System.out.println("public interface Java28Info não pode ser instanciada pelo comando");
        System.out.println("Java28Info info = new Java28Info();");
        System.out.println("metodo void showInfo() em Java28Info não pode ter corpo");
        System.out.println("void showInfo();");
        System.out.println();
        System.out.println("public class Java28Computer implements Java28Info");
        System.out.println("computer.showInfo(); executa o método em Java28Info");
        computer.showInfo();
    }
}
