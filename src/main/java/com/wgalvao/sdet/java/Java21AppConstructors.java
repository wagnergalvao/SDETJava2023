package com.wgalvao.sdet.java;

public class Java21AppConstructors {
    public static void main(String[] args) {
        Java21Computer computer1 = new Java21Computer();
        System.out.println(computer1);
        Java21Computer computer2 = new Java21Computer("Intel");
        System.out.println(computer2.processor);
    }
}
