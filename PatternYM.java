//Yanina Miller
//EVC COMSC075 Spring 2025

import java.util.Scanner;

public class PatternYM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (1-10): ");
        int rows = scanner.nextInt();

        if (rows < 1 || rows > 10) {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
            return;
        }

        System.out.println("\033[4m Pattern A  \033[0m");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println("\033[4m Pattern B  \033[0m");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        scanner.close();
    }
}