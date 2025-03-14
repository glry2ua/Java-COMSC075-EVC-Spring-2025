/* EVC075 Spring 2025 | Yanina Miller
 * Week3 Lab
 */
import java.util.Scanner;

public class Rectangle2YM {

    public static double getLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        return length;
    }

    public static double  getWidth (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        return width;
    }

    public static double getArea (double length, double width){
        return length * width;
    }

    public static void displayArea(double length, double width, double area){
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area);
            }

    public static void main(String[] args) {
       double length = getLength();
       double width =  getWidth();
       double area = getArea(length, width);
       displayArea(length, width, area);

    }
  //  scanner.close();
}

