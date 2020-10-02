package src.Level1;

import java.util.Scanner;

//Write a java program that accept four integer from the user and prints equal if all four are equal not not equal otherwise
public class _17Equalornot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scan.nextInt();
        System.out.print("Input second number: ");
        int num2 = scan.nextInt();
        System.out.print("Input third number: ");
        int num3 = scan.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = scan.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Numbers are not equal!");
        }
    }
}


