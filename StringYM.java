//Yanina Miller
//EVC COMSC075 Spring 2025
//Week 6 Lab

public class StringYM {
    public static void main(String[] args) {

        String welcomeMessage = "Welcome To The COMSC-75 Spring Course";
        System.out.println("The string in uppercase is: " + welcomeMessage.toUpperCase());
        System.out.println("The string in lowercase is: " + welcomeMessage.toLowerCase());
        System.out.println("The length of the string is: " + welcomeMessage.replace('g','k'));
        System.out.println("The length of the string is: " + welcomeMessage.length());
        System.out.println("Index of \"Course\": " + welcomeMessage.indexOf("Course"));

    }
}
