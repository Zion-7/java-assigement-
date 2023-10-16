import java.util.Scanner;
public class Main {
    // Variable declaration
    static int num = 17;
    static float flo = 23.5f;
    static double decimal = 8.8;
    static byte b = 34;
    static short s = 12;
    static long l = 234L;
    static char letter = 'A';
    static boolean bool = true;
    public static void main(String[] args) {
    System.out.println("This code will contain some fundamental concepts in the Java programming language.");
        variableDeclaration();
        arithmeticOperation();
        relationalOperation();
        logicalOperators();
        forLoop();
        whileLoop();
        switchCase();
        System.out.println("End of program");
    }
    // Variable declaration output
    public static void variableDeclaration() {
        System.out.println("num: " + num);
        System.out.println("flo: " + flo);
        System.out.println("decimal: " + decimal);
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("l: " + l);
        System.out.println("letter: " + letter);
        System.out.println("bool: " + bool);
    }
    public static void arithmeticOperation() {
        int sum = num + 5; // addition
        float difference = num - flo; // subtraction
        float product = flo * 4; // multiplication
        double quotient = decimal / 3; // division
        int modulus = num % 3; // modulus
        int inc = ++num; // increment
        float dec = --flo; // decrement
        // Arithmetic operation output
        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("modulus: " + modulus);
        System.out.println("inc: " + inc);
        System.out.println("dec: " + dec);
    }
    // Relational operators output
    public static void relationalOperation() {
        System.out.println("b > s: " + (b > s));
        System.out.println("b < s: " + (b < s));
        System.out.println("b >= s: " + (b >= s));
        System.out.println("b <= s: " + (b <= s));
        System.out.println("b == s: " + (b == s));
        System.out.println("b != s: " + (b != s));
    }
    // Logical operators output
    public static void logicalOperators() {
        System.out.println("bool && num > s: " + (bool && num > s));
        System.out.println("bool  num < s: " + (bool || num < s));
        System.out.println("!bool: " + !bool);
    }
    // For loop
    public static void forLoop() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
    // While loop
    public static void whileLoop() {
     String word = "hello";
         int w = 5;
         int i = 0;
     while (i < w)
     {
         System.out.println(word.substring(i));
         i++;
     }
    }
    // If-else statement
    public static void ifElseStatement() {
        if (num > flo) {
            System.out.println("num is greater than flo");
        } else if (num < flo) {
            System.out.println("num is less than flo");
        } else {
            System.out.println("num is equal to flo");
        }
    }
    // Switch-case
    public static void switchCase() {
        Scanner cased = new Scanner(System.in);
        System.out.println("enter your choice(1-4)");
        int day = cased.nextInt();
            switch (day) {
                case 1:
                    System.out.println("sunny day");
                    break;
                case 2:
                    System.out.println("moon day");
                    break;
                case 3:
                    System.out.println("star day");
                    break;
                case 4:
                    System.out.println("wind day");
                    break;
        }
    }
}