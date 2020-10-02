package Level1;

import java.util.Scanner;

//Write a hjava program to find if the given number is prime number.
public class _8Prime {
    public static void main(String[] args) {

        boolean a = true;
        while (a) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = scan.nextInt();
            for(int i=2;i<=num/2;i++)
            if (num%i==0) {
                System.out.println("Not a prime number");
                continue;
            } else {
                System.out.println("Prime number");
                break;
            }
        }
    }
}










