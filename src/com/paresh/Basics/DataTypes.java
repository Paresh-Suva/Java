package com.paresh.Basics;

public class DataTypes {
    public static void main(String[] args) {
        // Integer Data Types (with range and bits)
        byte byteVar = 127; // 8-bit, Range: -128 to 127
        short shortVar = 32000; // 16-bit, Range: -32,768 to 32,767
        int intVar = 100000; // 32-bit, Range: -2^31 to (2^31)-1 (~ -2.14B to 2.14B)
        long longVar = 1000000000L; // 64-bit, Range: -2^63 to (2^63)-1
        
        // Floating-Point Data Types (with precision and bits)
        float floatVar = 10.5f; // 32-bit, Precision: ~6-7 decimal digits
        double doubleVar = 99.99; // 64-bit, Precision: ~15 decimal digits
        
        // Character Data Type (with range in Unicode and bits)
        char charVar = 'A'; // 16-bit, Range: 0 to 65,535 (unsigned Unicode characters)
        
        // Boolean Data Type
        boolean boolVar = true; // 1-bit (JVM dependent), Values: true or false
        
        // Printing all data types
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + boolVar);
    }
}
