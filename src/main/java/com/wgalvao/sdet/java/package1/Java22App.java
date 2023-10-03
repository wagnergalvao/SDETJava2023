package com.wgalvao.sdet.java.package1;

public class Java22App {
    public static void main(String[] args) {
        Java22Computer computer = new Java22Computer();

        computer.gpu = "Nvidia";
        System.out.println("computer.gpu = \"Nvidia\";");
        computer.harddisk = "Seagate";
        System.out.println("computer.harddisk = \"Seagate\";");
        computer.motherboard = "ASUS";
        System.out.println("computer.motherboard = \"ASUS\";");
        System.out.println("computer.ram não permite alteração por ser private em Java22Computer");

        computer.setGpu("GPU");
        System.out.println("computer.setGpu(\"GPU\");");
        System.out.println("computer.getGpu()");
        System.out.println(computer.getGpu());

        computer.setHarddisk("Harddisk");
        System.out.println("computer.setHarddisk(\"Harddisk\");");
        System.out.println("computer.getHarddisk()");
        System.out.println(computer.getHarddisk());

        computer.setMotherboard("Motherboard");
        System.out.println("computer.setMotherboard(\"Motherboard\");");
        System.out.println("computer.getMotherboard()");
        System.out.println(computer.getMotherboard());

        computer.setRam(2048);
        System.out.println("computer.setRam(2048);");
        System.out.println("computer.getRam()");
        System.out.println(computer.getRam());
    }
}
