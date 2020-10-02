package Level1;

import java.util.Scanner;

//Write a java program to compute the area of a hexagon
public class _4Hexagon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        int x = input.nextInt();
        System.out.print("The area of the hexagon is: " + hexagonArea(x) + "\n");
    }

    public static double hexagonArea(int x) {
        return (6 * (x * x)) / (4 * Math.tan(Math.PI / 6));

    }
}


