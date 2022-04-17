package org.iiitb;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public App() {
    }

    public double addition(double a, double b) {
        logger.info("[ADDITION] - " + a + " " + b);
        double res = a + b;
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double subtraction(double a, double b) {
        logger.info("[SUBTRACTION] - " + a + " " + b);
        double res = a - b;
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double multiplication(double a, double b) {
        logger.info("[MULTIPLICATION] - " + a + " " + b);
        double res = a * b;
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double division(double a, double b) {
        logger.info("[DIVISION] - " + a + " " + b);
        double res = 0.0;

        if (b <= 0) {
            System.out.println("Cannot Divide By Zero.\n");
            throw new ArithmeticException();
        } else {
            res = a / b;
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double factorial(double n) {
        logger.info("[FACTORIAL] - " + n);
        if (n < 0) {
            System.out.println("Factorial of -ve numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = fact(n);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double fact(double n) {
        double factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public double logBase10(double n) {
        logger.info("[LOGBASE10] - " + n);
        if (n <= 0) {
            System.out.println("Logarithm of 0 or -ve numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = Math.log10(n);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double natLogA(double a) {
        logger.info("[NATURAL LOG A] - " + a);
        if (a <= 0) {
            System.out.println("Logarithm of 0 or -ve numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = Math.log(a);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double sqrt(double n) {
        logger.info("[SQRT] - " + n);
        if (n < 0) {
            System.out.println("Square Root of -ve Numbers isn't defined.\n");
            throw new IllegalArgumentException();
        } else {
            double res = Math.sqrt(n);
            logger.info("[RESULT] - " + res);
            return res;
        }
    }

    public double squared(double n) {
        logger.info("[SQUARED] - " + n);
        double res = Math.pow(n, 2);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double pow(double a, double n) {
        logger.info("[POW] - " + a + " " + n);
        double res = Math.pow(a, n);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double sin(double x) {
        logger.info("[SIN] - " + x);
        double res = Math.sin(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double cos(double x) {
        logger.info("[COS] - " + x);
        double res = Math.cos(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double tan(double x) {
        logger.info("[TAN] - " + x);
        double res = Math.tan(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double sinh(double x) {
        logger.info("[SINH] - " + x);
        double res = Math.sinh(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double cosh(double x) {
        logger.info("[COSH] - " + x);
        double res = Math.cosh(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public double tanh(double x) {
        logger.info("[TANH] - " + x);
        double res = Math.tanh(x);
        logger.info("[RESULT] - " + res);
        return res;
    }

    public void random() {

        double a, b, n;

        for (int i = 0; i < 3000; i++) {
            Random r = new Random();
            int res = r.nextInt(16);

            switch (res) {
                case 0:
                    addition(r.nextDouble() * 100, r.nextDouble() * 100);
                    break;

                case 1:
                    subtraction(r.nextDouble() * 100, r.nextDouble() * 10);
                    break;
                case 2:
                    multiplication(r.nextDouble() * 10, r.nextDouble() * 10);
                    break;
                case 3:
                    b = 1 + (100 - 1) * r.nextDouble();
                    division(r.nextDouble() * 100, b);
                    break;
                case 4:
                    n = 1 + (100 - 1) * r.nextDouble();
                    factorial(n);
                    break;
                case 5:
                    n = 2 + (100 - 2) * r.nextDouble();
                    logBase10(n);
                    break;
                case 6:
                    a = 2 + (100 - 2) * r.nextDouble();
                    natLogA(a);
                    break;
                case 7:
                    n = 0 + (100 - 0) * r.nextDouble();
                    sqrt(n);
                    break;
                case 8:
                    squared(r.nextDouble() * 10);
                    break;
                case 9:
                    pow(r.nextDouble() * 100, r.nextDouble() * 10);
                    break;
                case 10:
                    sin(r.nextDouble() * 10);
                    break;
                case 11:
                    cos(r.nextDouble() * 10);
                    break;
                case 12:
                    tan(r.nextDouble() * 10);
                    break;
                case 13:
                    sinh(r.nextDouble() * 10);
                    break;
                case 14:
                    cosh(r.nextDouble() * 10);
                    break;
                case 15:
                    tanh(r.nextDouble() * 10);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {

        double a, b;

        App calc = new App();

        Scanner sc = new Scanner(System.in);

        do {
            int choice;
            String menu = "1. Addition(a+b)\n" + "2. Subtraction(a-b)\n" + "3. Multiplication(a*b)\n"
                    + "4. Division(n/d)\n" + "5. Factorial of n(n!)\n" + "6. log\u2081\u2080 n\n" + "7. log\u2091 a\n"
                    + "8. Square Root of n(\u221An)\n" + "9. n Squared(n\u00B2)\n" + "10. a\u207F\n" + "11. sin x\n"
                    + "12. cos x\n" + "13. tan x\n" + "14. sinh x\n" + "15. cosh x\n" + "16. tanh x\n"
                    + "17. Random 3k Calls\n" + "18. Exit\n";

            System.out.println("Choose any Operation");
            System.out.println(menu);
            System.out.println("Please enter your choice:");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException error) {
                sc.close();
                return;
            }

            switch (choice) {
                case 1:

                    System.out.print("\nEnter a: ");
                    a = sc.nextDouble();
                    System.out.print("\nEnter b: ");
                    b = sc.nextDouble();
                    System.out.println("Sum of " + a + " & " + b + " is: " + calc.addition(a, b));
                    System.out.println("\n");

                    break;
                case 2:
                    System.out.print("\nEnter a: ");
                    a = sc.nextDouble();
                    System.out.print("\nEnter b: ");
                    b = sc.nextDouble();
                    System.out.println("Difference between " + a + " & " + b + " is: " + calc.subtraction(a, b));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("\nEnter a: ");
                    a = sc.nextDouble();
                    System.out.print("\nEnter b: ");
                    b = sc.nextDouble();
                    System.out.println("Product of " + a + " & " + b + " is: " + calc.multiplication(a, b));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("\nEnter n: ");
                    a = sc.nextDouble();
                    System.out.print("\nEnter d: ");
                    b = sc.nextDouble();
                    System.out.println("Quotient of " + a + "/" + b + " is: " + calc.division(a, b));
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("\nEnter n: ");
                    a = sc.nextDouble();
                    System.out.println("Factorial of " + a + " is: " + calc.factorial(a));
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.print("\nEnter n: ");
                    a = sc.nextDouble();
                    System.out.println("log\u2081\u2080 " + a + " is: " + calc.logBase10(a));
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.print("\nEnter a: ");
                    a = sc.nextDouble();
                    System.out.println("log\u2091 " + a + " is: " + calc.natLogA(a));
                    System.out.println("\n");
                    break;
                case 8:
                    System.out.print("\nEnter n: ");
                    a = sc.nextDouble();
                    System.out.println("\u221A" + a + " is: " + calc.sqrt(a));
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.print("\nEnter n: ");
                    a = sc.nextDouble();
                    System.out.println(a + "\u00B2 is: " + calc.squared(a));
                    System.out.println("\n");
                    break;
                case 10:
                    System.out.print("\nEnter a(base): ");
                    a = sc.nextDouble();
                    System.out.print("\nEnter n(exp): ");
                    b = sc.nextDouble();
                    System.out.println(a + " ^ " + b + " is: " + calc.pow(a, b));
                    System.out.println("\n");
                case 11:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("sin " + a + " is: " + calc.sin(a));
                    System.out.println("\n");
                    break;
                case 12:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("cos " + a + " is: " + calc.cos(a));
                    System.out.println("\n");
                    break;
                case 13:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("tan " + a + " is: " + calc.tan(a));
                    System.out.println("\n");
                    break;
                case 14:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("sinh " + a + " is: " + calc.sinh(a));
                    System.out.println("\n");
                    break;
                case 15:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("cosh " + a + " is: " + calc.cosh(a));
                    System.out.println("\n");
                    break;
                case 16:
                    System.out.print("\nEnter x: ");
                    a = sc.nextDouble();
                    System.out.println("tanh " + a + " is: " + calc.tanh(a));
                    System.out.println("\n");
                    break;
                case 17:
                    System.out.println("Starting Random Calls");
                    calc.random();
                    System.out.println("Random Ended");
                    break;
                case 18:
                    System.out.println("Thank you");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option - Exiting Application");
                    sc.close();
                    return;
            }
        } while (true);
    }

}