package com.wgalvao.sdet.java;

import java.time.LocalDateTime;

/**
 * Scanner scanner = new Scanner(System.in);
 * 
 * String sentence = scanner.nextLine();
 * 
 * Integer number = scanner.nextInt();
 * 
 */

public class Java16SwitchCaseStatement {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("today " + now);

        switch (now.getDayOfWeek().getValue()) {
            case 1:
                System.out.println("Segunda-feira, " + now);
                break;
            case 2:
                System.out.println("Terça-feira, " + now);
                break;
            case 3:
                System.out.println("Quarta-feira, " + now);
                break;
            case 4:
                System.out.println("Quinta-feira, " + now);
                break;
            case 5:
                System.out.println("Sexta-feira, " + now);
                break;
            case 6:
                System.out.println("Sábado, " + now);
                break;
            case 7:
                System.out.println("Domingo-feira, " + now);
                break;
        }
    }
}
