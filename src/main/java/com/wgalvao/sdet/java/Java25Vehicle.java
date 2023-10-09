package com.wgalvao.sdet.java;

public abstract class Java25Vehicle {
    private int id;
    private final String brand = "Audi";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void drive();
}
