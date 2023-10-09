package com.wgalvao.sdet.java;

public class Java26App {
    public static void main(String[] args) {

        System.out.println("Java26Computer computer = new Java26Computer();");
        Java26Computer computer = new Java26Computer();
        System.out.println("computer.start();");
        computer.start();
        System.out.println("computer.showInfo();");
        computer.showInfo();
        System.out.println();
        System.out.println("public interface Java26Info não pode ser instanciada pelo comando");
        System.out.println("Java26Info info = new Java26Info();");
        System.out.println("metodo void showInfo() em Java26Info não pode ter corpo");
        System.out.println("void showInfo();");
        System.out.println();
        System.out.println("public class Java26Computer implements Java26Info");
        System.out.println("computer.showInfo(); executa o método em Java26Info");
        computer.showInfo();
    }
}
