package com.wgalvao.sdet.java;

public class Java27AppFinalKeyword {
    public static void main(String[] args) {
        Java27Car car = new Java27Car();
        Java27Motorcycle motorcycle = new Java27Motorcycle();
        System.out.println("Final keyword só pode ser atruibída com valor constante");
        System.out.println("public abstract class Java27Vehicle {\r\n" + //
                "    private int id;\r\n" + //
                "    private final String brand = \"Audi\";");
        System.out.println();
        System.out.println("por ser valor constante só pode existir getter");
        System.out.println("public String getBrand() {\r\n" + //
                "    return brand;\r\n" + //
                "}");
        System.out.println();
        System.out.println("System.out.println(car.getBrand());");
        System.out.println(car.getBrand());
        System.out.println();
        System.out.println("System.out.println(motorcycle.getBrand());");
        System.out.println(motorcycle.getBrand());
    }
}
