package com.wgalvao.sdet.java;

/**
 * Primitive Data Type
 * numerical primitives
 *         Integer integerValue = 2147483647;
 *         Short shortValue = -32768;
 * 
 */
public class Java08ReferenceDataType {
    public static void main(String[] args) {

        Integer integerValue = 2147483647;
        System.out.println("integerValue.intValue() " + integerValue.intValue());
        System.out.println("Integer.toHexString(integerValue)) " + Integer.toHexString(integerValue));
        System.out.println("integerValue.toString() " + integerValue.toString());

        Short shortValue = -32768;
        System.out.println("shortValue.shortValue() " + shortValue.shortValue());
        System.out.println("shortValue.floatValue() " + shortValue.floatValue());
    }
}
