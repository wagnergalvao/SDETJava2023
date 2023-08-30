package com.wgalvao.sdet.java;

/**
 * 
 * statement if true
 * statement if false
 */

public class Java11IfStatements {
    public static void main(String[] args) {

        int number = 10;

        if (number > 5)
            System.out.println("Declaração number > 5 é verdadeira: " + number + " > 5, a instrução do if é executada");

        if (number > 5) {
            System.out.println("Declaração number > 5 é verdadeira: " + number + " > 5");
            System.out.println("Bloco de instruções do if são executadas");
        }

        if (number < 5) {
        } else {
            System.out.println("Declaração number < 5 é falsa     : " + number + " < 5");
            System.out.println("Bloco de instruções do else são executadas");
        }

    }
}
