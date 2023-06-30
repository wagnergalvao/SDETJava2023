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
        System.out.println("Bitwise AND ........: left & right   " + (left & right));
        System.out.println("Bitwise OR .........: left | right   " + (left | right));
        System.out.println("Bitwise Exclusive OR: left ^ right   " + (left ^ right));
        System.out.println("Bitwise Complement .: ~left          " + (~left));
        System.out.println("Bitwise Left Shift .: right << 1     " + (right << 1));
        System.out.println("Bitwise Right Shift : right >> 1     " + (right >> 1));
        System.out.println("Right Zero Fill ....: left >>> right " + (left >>> right));

    }
}
