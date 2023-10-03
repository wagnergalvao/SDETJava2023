package com.wgalvao.sdet.java;

public class Java20App {
    public static void main(String[] args) {
        Java20Computer computer1 = new Java20Computer();
        System.out.println(computer1.toString());
        Java20Computer computer2 = new Java20Computer("Intel");
        System.out.println(computer2.processor);
    }
}
