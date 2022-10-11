package javahomework;

import java.util.Scanner;
//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).
public class JavaProgrammes7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temprature in fahrenheit:");
        double f = s.nextDouble();
        double c = 5.0/9.0 * (f-32);
        System.out.println("temperature="+c);


    }
}
