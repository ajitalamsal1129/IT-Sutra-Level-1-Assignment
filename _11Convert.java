package Level1;

import java.util.Scanner;

//Write a Java Program to convert seconds to H.M.S
public class _11Convert {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scan.nextInt();
        int H = seconds % 60;
        int M = seconds / 60;
        int S = M % 60;
        M = M / 60;
        System.out.print( M + ":" + S + ":" + H);
        System.out.print("\n");
    }
}


