package com.wgalvao.sdet.java;

public class Java26AppAbstractClasses {
    public static void main(String[] args) {
        System.out.println("public abstract class Java26Vehicle não pode ser instanciada pelo comando");
        System.out.println("Java26Vehicle vehicle = new Java26Vehicle();");
        System.out.println();
        System.out.println(
                "public class Java26Car extends Java26Vehicle estende a classe abstrata para uso pelo comando");
        System.out.println("Java26Car car = new Java26Car();");
        Java26Car car = new Java26Car();
        car.setID(1);
        System.out.println("car.setID(1);");
        System.out.println("System.out.println(car.getID());");
        System.out.println(car.getID());
        System.out.println();
        System.out.println("public class Java26Motorcycle extends Java26Vehicle");
        Java26Motorcycle motorcycle = new Java26Motorcycle();
        System.out.println("Java26Motorcycle motorcycle = new Java26Motorcycle();");
        System.out.println("motorcycle.setID(2);");
        motorcycle.setID(2);
        System.out.println("System.out.println(motorcycle.getID());");
        System.out.println(motorcycle.getID());
        System.out.println();
        System.out.println("o método public abstract void drive(); em public abstract class Java26Vehicle");
        System.out.println("precisa ser sobreposto na classe public class Java26Car");
        System.out.println("@Override\r\n" + //
                "public void drive() {\r\n" + //
                "    System.out.println(\"O carro está estacionado\");\r\n" + //
                "}");
        System.out.println("car.drive();");
        car.drive();
        System.out.println();
        System.out.println("e na classe public class Java26Motorcycle");
        System.out.println("@Override\r\n" + //
                "public void drive() {\r\n" + //
                "    System.out.println(\"A motocicleta está em trânsito\");\r\n" + //
                "}");
        System.out.println("motorcycle.drive();");
        motorcycle.drive();
    }
}
