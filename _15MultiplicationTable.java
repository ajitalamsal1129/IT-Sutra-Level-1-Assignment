package Level1;

import java.util.Scanner;

//Write a java program to display multiplication table of a given number
public class _15MultiplicationTable {
    public static void main(String args[])
    {
        int c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       System.out.println("Multiplication table of " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n*c));
    }
}