// Yanna Miller
// EVC COMSC075 Spring 2025
// Test1_PartA_2.java
// Automobile: loan payment, insurance, gas, oil, tires, and maintenance. monthly cost and annual cost
// Do not accept negative values for either the wholesale cost of the item or the markup percentage.

import java.util.Scanner;

public class Test1_PartA_2 {

    public static double carMonthlyCost(double loan, double insurance, double gas, double oil, double tires, double maintenance) {
        return loan + insurance + gas + oil + tires + maintenance;
    }

    public static double invalidInput(Scanner scanner, String prompt) {
        double value;
        do {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value < 0) {
                System.out.println("Negative values are not allowed. Please enter a positive number.");
            }
        } while (value < 0);
        return value;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double loan = invalidInput(scanner, "Enter your monthly Loan Payment: $");
            double insurance = invalidInput(scanner, "Enter your monthly Insurance cost: $");
            double gas = invalidInput(scanner, "Enter your monthly Gas cost: $");
            double oil = invalidInput(scanner, "Enter your monthly Oil cost: $");
            double tires = invalidInput(scanner, "Enter your monthly Tires cost: $");
            double maintenance = invalidInput(scanner, "Enter your monthly Maintenance cost: $");

            double monthlyTotal = carMonthlyCost(loan, insurance, gas, oil, tires, maintenance);
            double annualTotal = monthlyTotal * 12;

            System.out.printf("Total Monthly Cost: $%.2f\n", monthlyTotal);
            System.out.printf("Total Annual Cost: $%.2f\n", annualTotal);

            scanner.close();
        }
    }



