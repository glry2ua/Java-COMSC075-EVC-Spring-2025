//Yanna Miller
//EVC COMSC075 Spring 2025
//Test1_PartA_1.java

import java.util.Scanner;

public class Test1_PartA_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
        scanner.close();
    }
}
