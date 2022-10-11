package javahomework;

import java.util.Scanner;

public class JavaProgrammes15 {
    //Write a Java program to swap two variables.
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" first number ");
        a = scanner.nextInt();
        System.out.print("second number");
        b = scanner.nextInt();
        c = a;
        a = b;
        b = c;

        System.out.println("swap two variables:" + a + " and" + b);


    }

}




