package javahomework;

import java.util.Scanner;

//Write a program to convert the upper case to lower case.
public class JavaProgrammes9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        System.out.println(str.toLowerCase());
        scanner.close();

    }
}

