//Yanna Miller
//EVC COMSC075 Spring 2025

import java.util.Scanner;

public class CalculatorYM  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the result of the calculation.");
        System.out.print("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter your operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Your result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Your result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Your result is: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero situation.");
                } else {
                    result = num1 / num2;
                    System.out.println("Your result is: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, or /.");
        }

        scanner.close();
    }
}
