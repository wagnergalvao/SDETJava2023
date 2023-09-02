package com.wgalvao.sdet.java;

public class Java12ForLoops {
    public static void main(String[] args) {

        System.out.println("Laço for de count iniciado em 0 até 9 com operador de incremento");
        for (int count = 0; count < 10; count++) {
            System.out.println("for (int count = 0; count < 10; count++) " + count);
        }

        System.out.println("Laço for de count iniciado em 10 até 1 com operador de decremento");
        for (int count = 10; count > 0; count--) {
            System.out.println("for (int count = 10; count > 0; count--) " + count);
        }

        System.out.println("Laço for de count iniciado em 0 até 8 com incremento duplo");
        for (int count = 0; count < 10; count += 2) {
            System.out.println("for (int count = 0; count < 10; count += 2) " + count);
        }

        System.out.println("Laço for de count iniciado em 10 até 1 com decremento triplo");
        for (int count = 10; count > 0; count -= 3) {
            System.out.println("for (int count = 10; count > 0; count -= 3) " + count);
        }

        System.out.println("Laços for aninhados");

        for (int dozens = 0; dozens < 10; dozens++) {
            for (int units = 0; units < 10; units++) {
            String text = dozens + " dezenas e " + units + " unidades é igual a " + dozens + units;
            System.out.println(text);

            }
        }

    }
}
