public class Operator{
    public static void main(String[] args) {
        // Variables for arithmetic, relational, and assignment operators
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b: " + (a + b));  // Addition
        System.out.println("a - b: " + (a - b));  // Subtraction
        System.out.println("a * b: " + (a * b));  // Multiplication
        System.out.println("a / b: " + (a / b));  // Division
        System.out.println("a % b: " + (a % b));  // Modulus
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));  // Greater than
        System.out.println("a < b: " + (a < b));  // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
        System.out.println();

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));  // Logical NOT
        System.out.println();

        // Bitwise Operators
        int c = 5;  // 0101 in binary
        int d = 3;  // 0011 in binary
        System.out.println("Bitwise Operators:");
        System.out.println("c & d: " + (c & d));  // Bitwise AND
        System.out.println("c | d: " + (c | d));  // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d));  // Bitwise XOR
        System.out.println("~c: " + (~c));  // Bitwise NOT
        System.out.println("c << 2: " + (c << 2));  // Left shift
        System.out.println("c >> 2: " + (c >> 2));  // Right shift
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        a += b;
        System.out.println("a += b: " + a);  // a = 15
        a -= b;
        System.out.println("a -= b: " + a);  // a = 10
        a *= b;
        System.out.println("a *= b: " + a);  // a = 50
        a /= b;
        System.out.println("a /= b: " + a);  // a = 10
        a %= b;
        System.out.println("a %= b: " + a);  // a = 0
        System.out.println();

        // Conditional (Ternary) Operator
        System.out.println("Conditional (Ternary) Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
