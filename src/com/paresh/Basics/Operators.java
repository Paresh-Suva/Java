package com.paresh.Basics;

public class Operators {

    public static void main(String[] args) {
    	
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // AND
        System.out.println("x || y: " + (x || y)); // OR
        System.out.println("!x: " + (!x));         // NOT

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
        System.out.println("~a: " + (~a));       // Bitwise Complement
        System.out.println("a << 2: " + (a << 2)); // Left Shift
        System.out.println("a >> 2: " + (a >> 2)); // Right Shift

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        System.out.println("c += 3: " + (c += 3)); // c = c + 3
        System.out.println("c -= 2: " + (c -= 2)); // c = c - 2
        System.out.println("c *= 2: " + (c *= 2)); // c = c * 2
        System.out.println("c /= 2: " + (c /= 2)); // c = c / 2
        System.out.println("c %= 2: " + (c %= 2)); // c = c % 2

        // 6. Unary Operators
        int d = +5, e = -5;
        System.out.println("\nUnary Operators:");
        System.out.println("d: " + d); // Unary plus
        System.out.println("e: " + e); // Unary minus
        System.out.println("Increment (a++): " + (a++));
        System.out.println("After Increment, a: " + a);
        System.out.println("Decrement (a--): " + (a--));
        System.out.println("After Decrement, a: " + a);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // 8. Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        Operators obj = new Operators();
        System.out.println("obj instanceof OperatorsDemo: " + (obj instanceof Operators));
    }
}
