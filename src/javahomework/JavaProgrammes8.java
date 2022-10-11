package javahomework;
//Write a program to calculate the area of a triangle.
import java.util.Scanner;

public class JavaProgrammes8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter the width of a Triangle:");
            double w= scanner.nextDouble();
        System.out.println("Enter the height of a Triangle:");
            double h= scanner.nextDouble();
        // Area = (width and height)/2
        double area = (w*h)/2;

        System.out.println("Area of triangle is : "+ area);
        scanner.close();
    }


}
