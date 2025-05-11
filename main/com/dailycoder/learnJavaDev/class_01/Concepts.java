package main.com.dailycoder.learnJavaDev.class_01;

/**
 * A simple Java program demonstrating:
 * - Primitive and non-primitive data types
 * - Variables and their scope
 * - Operators
 * - Control statements (if, if-else, switch)
 * - Looping statements
 */
public class Concepts {
    // Class level variable (non-primitive)
    static String appName = "Java Concepts Demo";

    public static void main(String[] args) {
        System.out.println("Welcome to " + appName);
        System.out.println("----------------------------------");

        // Primitive data types
        byte byteVar = 100;                   // 8-bit integer
        short shortVar = 1000;                // 16-bit integer
        int intVar = 100000;                  // 32-bit integer
        long longVar = 10000000000L;          // 64-bit integer
        float floatVar = 10.5f;              // 32-bit floating point
        double doubleVar = 20.123456789;      // 64-bit floating point
        char charVar = 'A';                   // 16-bit Unicode
        boolean booleanVar = true;            // true/false

        // Non-primitive data types
        String stringVar = "Hello Java";      // String object
        int[] intArray = {1, 2, 3, 4, 5};     // Array object

        // Displaying variables
        System.out.println("\n--- Variable Demonstration ---");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
        System.out.println("String: " + stringVar);
        System.out.print("Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Operators demonstration
        System.out.println("\n\n--- Operators Demonstration ---");
        int a = 10, b = 5;
        System.out.println("Arithmetic: " + a + " + " + b + " = " + (a + b));
        System.out.println("Relational: " + a + " > " + b + " = " + (a > b));
        System.out.println("Logical: " + a + " < 20 && " + b + " > 0 = " + (a < 20 && b > 0));

        // Variable scope demonstration
        System.out.println("\n--- Variable Scope Demonstration ---");
        {
            int blockScopedVar = 50; // Only accessible in this block
            System.out.println("Block scoped variable: " + blockScopedVar);
        }
        // System.out.println(blockScopedVar); // This would cause error - out of scope

        // Control statements
        System.out.println("\n--- Control Statements ---");

        // If statement
        if (booleanVar) {
            System.out.println("This is printed because booleanVar is true");
        }

        // If-else statement
        if (a > 100) {
            System.out.println("a is greater than 100");
        } else {
            System.out.println("a is not greater than 100");
        }

        // If-else if ladder
        System.out.println("\n--- If-Else If Ladder ---");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // Switch statement
        System.out.println("\n--- Switch Statement ---");
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Need improvement");
        }

        // Looping statements
        System.out.println("\n--- Looping Statements ---");

        // For loop
        System.out.println("For loop (1-5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // While loop
        System.out.println("\n\nWhile loop (5-1):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }

        // Do-while loop
        System.out.println("\n\nDo-while loop (1-5):");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);

        // Enhanced for loop (for-each)
        System.out.println("\n\nEnhanced for loop (array elements):");
        for (int element : intArray) {
            System.out.print(element + " ");
        }

        System.out.println("\n\nProgram completed successfully!");
    }
}
