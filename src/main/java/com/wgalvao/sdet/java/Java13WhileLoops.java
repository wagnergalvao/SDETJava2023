package com.wgalvao.sdet.java;

/**
 * 
 * statement if true
 * statement if false
 */

public class Java13WhileLoops {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Laço while de 0 a 9");
        while (count < 10) {
            System.out.println("Enquanto( " + count + " < 10) for verdadeiro, o laço continua executando");
            count++;
        }

        System.out.println("Laço while de 10 a 1");
        while (count > 0) {
            System.out.println("Enquanto( " + count + " > 0) for verdadeiro, o laço continua executando");
            count--;
        }

        System.out.println("Laços while aninhados");
        int dozens = 0;
        while (dozens < 10) {
            int units = 0;
            while (units < 10) {
                System.out.println(dozens + " dezenas e " + units + " unidades é igual a " + dozens + units);
                units++;
            }
            dozens++;
        }

    }
}
