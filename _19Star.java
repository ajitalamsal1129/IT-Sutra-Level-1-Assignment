package src.Level1;

import java.util.Scanner;

//Write a program to input user requestto print how many stars they want and print below format.
public class _19Star {
    public static void main(String[] args) {
        int i, j;
        System.out.print("Input number of rows : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (i = 1; i <= n; i++) {//outer loop for number of rows(n)
            for (j = 1; j <=i; j++)  //  inner loop for columns
                System.out.print("*"); // print star
            System.out.println(""); // printing space
        }

    }
}





