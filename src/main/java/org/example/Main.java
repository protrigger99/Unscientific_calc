package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root ( √x )");
            System.out.println("2. Factorial (!x)");
            System.out.println("3. Natural Logarithm(e) (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            logger.info("User selected option: " + choice);

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double x = scanner.nextDouble();
                    System.out.println("√" + x + " = " + Math.sqrt(x));
                    logger.debug("Calculated square root of: " + x);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    System.out.println(n + "! = " + factorial(n));
                    logger.debug("Calculated factorial of: " + n);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnInput = scanner.nextDouble();
                    System.out.println("ln(" + lnInput + ") = " + Math.log(lnInput));
                    logger.debug("Calculated natural logarithm (ln) of: " + lnInput);
                    break;
                case 4:
                    System.out.print("Enter the base number (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    logger.debug("Calculated power: " + base + "^" + exponent);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    logger.info("User exited.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    logger.warn("User entered invalid option: " + choice);
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
