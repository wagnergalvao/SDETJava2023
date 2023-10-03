package com.wgalvao.sdet.java.package1;

public class Java23Computer {
    private int ram;
    protected String gpu;
    private String harddisk;
    private String motherboard;
    public static String type = "Digital";

    public Java23Computer() {
        System.out.println("Carregado o construtor Java23Computer");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

}
