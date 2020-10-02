package Level1;

import java.util.Scanner;

//Write a java program to swap two variables
public class _3Swap {
    public static void main(String[] args) {
        int a, b, c ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number: ");
        a = scan.nextInt();
        System.out.println("Input the second number: ");
        b = scan.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println(" Swapped values are3:" + a + " and " + b);
    }
}
