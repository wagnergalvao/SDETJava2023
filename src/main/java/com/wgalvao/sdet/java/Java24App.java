package com.wgalvao.sdet.java;

public class Java24App {
    public static void main(String[] args) {
        System.out.println("public abstract class Java24Vehicle não pode ser instanciada pelo comando");
        System.out.println("Java24Vehicle vehicle = new Java24Vehicle();");
        System.out.println();
        System.out.println(
                "public class Java24Car extends Java24Vehicle estende a classe abstrata para uso pelo comando");
        System.out.println("Java24Car car = new Java24Car();");
        Java24Car car = new Java24Car();
        car.setID(1);
        System.out.println("car.setID(1);");
        System.out.println("System.out.println(car.getID());");
        System.out.println(car.getID());
        System.out.println();
        System.out.println("public class Java24Motorcycle extends Java24Vehicle");
        Java24Motorcycle motorcycle = new Java24Motorcycle();
        System.out.println("Java24Motorcycle motorcycle = new Java24Motorcycle();");
        System.out.println("motorcycle.setID(2);");
        motorcycle.setID(2);
        System.out.println("System.out.println(motorcycle.getID());");
        System.out.println(motorcycle.getID());
        System.out.println();
        System.out.println("o método public abstract void drive(); em public abstract class Java24Vehicle");
        System.out.println("precisa ser sobreposto na classe public class Java24Car");
        System.out.println("@Override\r\n" + //
                "public void drive() {\r\n" + //
                "    System.out.println(\"O carro está estacionado\");\r\n" + //
                "}");
        System.out.println("car.drive();");
        car.drive();
        System.out.println();
        System.out.println("e na classe public class Java24Motorcycle");
        System.out.println("@Override\r\n" + //
                "public void drive() {\r\n" + //
                "    System.out.println(\"A motocicleta está em trânsito\");\r\n" + //
                "}");
        System.out.println("motorcycle.drive();");
        motorcycle.drive();
    }
}
