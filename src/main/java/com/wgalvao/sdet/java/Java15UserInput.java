package com.wgalvao.sdet.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Scanner scanner = new Scanner(System.in);
 * 
 * String sentence = scanner.nextLine();
 * 
 * Integer number = scanner.nextInt();
 * 
 */

public class Java15UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um texto e tecle Enter");
            String sentence = scanner.nextLine();
            System.out.println("");
            System.out.println(sentence);
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Digite um número inteiro e tecle Enter");
            Integer number = scanner.nextInt();
            System.out.println("");
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro entre -2147483648 e 2147483647");
        }
    }
}
