package com.wgalvao.sdet.java;

/**
 * 
 * Operators
 * Arithmetic Operators
 * Comparison Operators
 * Logical Operators
 * Bitwise Operators
 * Left is 9 which is 0000 1001 in Binary
 * Right is 8 which is 0000 1000 in Binary
 */

public class Java10Operators {
    public static void main(String[] args) {

        int left = 5;
        int right = 6;
        int negative = -4;

        System.out.println("Arithmetic Operators");
        System.out.println("left = " + left + " right = " + right);
        System.out.println("Addition .....: left + right " + (left + right));
        System.out.println("Substraction .: left - right " + (left - right));
        System.out.println("Multiplication: left * right " + (left * right));
        System.out.println("Division .....: left / right " + (left / right));
        System.out.println("Modulo .......: left % right " + (left % right));
        System.out.println("Post Increment: left++       " + left++);
        System.out.println("Post Decrement: right--      " + right--);
        System.out.println("Pre Increment : ++left       " + ++left);
        System.out.println("Pre Decrement : --right      " + --right);

        System.out.println("Comparison Operators");
        System.out.println("left = " + left + " right = " + right);
        System.out.println("Less Than ......: left < right  " + (left < right));
        System.out.println("Equals .........: left == right " + (left == right));
        System.out.println("Greater Than ...: left > right  " + (left > right));
        System.out.println("Greater or Equal: left >= right " + (left >= right));
        System.out.println("Less or Equal ..: left <= right " + (left <= right));

        System.out.println("Assignment Operators");
        System.out.println("left = " + left + " right = " + right);
        System.out.println("Equals .: left = 9  " + (left = 9));
        System.out.println("Add ....: left += 9 " + (left += 9));
        System.out.println("Subtract: left -= 9 " + (left -= 9));

        System.out.println("Bitwise Operators");
        System.out.println("left = " + left + " right = " + right);
        System.out.println("left " + Integer.toBinaryString(left) + " rigth "
                + Integer.toBinaryString(right));
        System.out.println("Bitwise AND ........: left & right   " + (left & right) + " -> "
                + Integer.toBinaryString((left & right)));
        System.out.println("O operador & executa uma operação AND bit a bit");
        System.out.println("Bitwise OR .........: left | right   " + (left | right) + " -> "
                + Integer.toBinaryString((left | right)));
        System.out.println("O operador | executa uma operação OR inclusiva bit a bit");
        System.out.println("Bitwise Exclusive OR: left ^ right   " + (left ^ right) + " -> "
                + Integer.toBinaryString((left ^ right)));
        System.out.println("O operador ^ executa uma operação OR exclusiva bit a bit");
        System.out.println("Bitwise Complement .: ~left          " + (~left) + " -> "
                + Integer.toBinaryString((~left)));
        System.out.println("O operador ~ inverte cada bit do número " + left + " -> " + Integer.toBinaryString(left));

        System.out.println("Bitwise Left Shift .: right << 1     " + (right << 1) + " -> "
                + Integer.toBinaryString((right << 1)));
        System.out.println("O operador << desloca o(s) bit(s) para a esquerda acresecentando 0 à direita do número  "
                + right + " -> " + Integer.toBinaryString(right));
        System.out.println("Bitwise Right Shift : right >> 1     " + (right >> 1) + " -> "
                + Integer.toBinaryString((right >> 1)));
        System.out.println(
                "O operador >> desloca o(s) bit(s) para a direita acresecentando o bit do sinal à esquerda "
                        + right + " -> " + Integer.toBinaryString(right));
        System.out.println("Bitwise Right Shift : negative >> 1     " + (negative >> 1) + " -> "
                + Integer.toBinaryString((negative >> 1)));
        System.out.println(
                "O operador >> desloca o(s) bit(s) para a direita acresecentando o bit do sinal à esquerda "
                        + negative + " -> " + Integer.toBinaryString(negative));
        System.out.println("Right Zero Fill ....: right >>> left " + (right >>> left) + " -> " + Integer.toBinaryString((right >>> left)));
        System.out.println(
                "O operador >>> desloca o(s) bit(s) para a direita sem sinal (0) à esquerda "
                        + right + " -> " + Integer.toBinaryString(right));
        System.out.println("Right Zero Fill ....: negative >>> left " + (negative >>> left) + " -> " + Integer.toBinaryString((negative >>> left)));
        System.out.println(
                "O operador >>> desloca o(s) bit(s) para a direita sem sinal (0) à esquerda "
                        + negative + " -> " + Integer.toBinaryString(negative));

    }
}
