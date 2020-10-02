package Level1;

import java.util.Scanner;
//Find the factorial of the given number
public class _13Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        long x = 1;
        int y = 1;
        while(y<=number)
        {
            x = x * y;
            y++;
        }
        System.out.println("Factorial of "+number+" is: "+x);
    }
}

