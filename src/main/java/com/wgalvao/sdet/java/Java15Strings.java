package com.wgalvao.sdet.java;

/**
 * 
 * String text01 = "Hello ";
 * 
 * String text02 = new String();
 * text02 = "World";
 * String text03 = "1"
 * 
 * Concat -> text01.concat(text02.concat(text03))
 * Tamanho -> text01.length()
 * Contains -> text01.contains("Hello")
 * toString -> number01.toString()
 * replace -> number01.toString().replace(".", ",")
 * 
 */

public class Java15Strings {
    public static void main(String[] args) {

        String text01 = "Hello ";
        System.out.println("text01 = " + text01);

        String text02 = new String();
        text02 = "World";
        System.out.println("text02 = " + text02);

        String text03 = "!";
        System.out.println("text03 = " + text03);

        Float number01 = 123.456f;
        System.out.println("number01 = " + number01);

        System.out.println(
                "text01.concat(text02.concat(text03)) resulta " + text01.concat(text02.concat(text03)));
        System.out.println("text01.length() = " + text01.length());
        System.out.println("text02.length() = " + text02.length());
        System.out.println("text03.length() = " + text03.length());
        System.out.println(text01 + " contains Hello retorna " + text01.contains("Hello"));
        System.out.println(text02 + " contains ! retorna " + text02.contains("!"));
        System.out.println(text03 + " not contains World retorna " + !text03.contains("World"));
        System.out.println("number01.toString() = " + number01.toString());
        System.out.println("number01.toString().replace(\".\", \",\") = " + number01.toString().replace(".", ","));
    }
}
