package com.paresh.Basics;

public class TypeCasting {

    public static void main(String[] args) {
        // Implicit Casting (Widening Conversion)
        int num = 100;
        double doubleNum = num; // int to double
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        // Explicit Casting (Narrowing Conversion)
        double decimalValue = 45.67;
        int intValue = (int) decimalValue; // double to int
        System.out.println("Explicit Casting (double to int): " + intValue);

        // Casting in Expressions
        int x = 5;
        int y = 2;
        double divisionResult = (double) x / y; // Casting one operand to double
        System.out.println("Casting in Expression (int to double): " + divisionResult);

        // Casting char to int
        char letter = 'A';
        int asciiValue = (int) letter; // char to int (ASCII)
        System.out.println("Casting char to int (ASCII Value of 'A'): " + asciiValue);

        // Byte to int (Widening) and back to byte (Narrowing)
        byte byteValue = 10;
        int intFromByte = byteValue; // byte to int
        byte narrowedByte = (byte) intFromByte; // int to byte (Explicit)
        System.out.println("Byte to int (Widening): " + intFromByte);
        System.out.println("Int to byte (Narrowing): " + narrowedByte);

        // Long to float and vice-versa
        long longValue = 123456789L;
        float floatValue = longValue; // long to float (Implicit)
        System.out.println("Long to float: " + floatValue);

        // Float to int (Explicit)
        float anotherFloatValue = 9.99f;
        int narrowedInt = (int) anotherFloatValue;
        System.out.println("Float to int (Explicit): " + narrowedInt);
    }
}
