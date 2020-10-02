package Level1;

import java.util.Scanner;

public class _2Rectangle {
    public static void main(String args[]) {
        int length, width, area, perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of Rectangle");
        length = scan.nextInt();
        System.out.println("Enter width of Rectangle");
        width = scan.nextInt();
        // Area of rectangle = length X width
        area = length * width;
        // Perimeter of rectangle = 2 X (length X width)
        perimeter = 2 * (length + width);
        System.out.println("Area of Rectangle : " + area);
        System.out.println("Perimeter of Rectangle : " + perimeter);
    }

}

