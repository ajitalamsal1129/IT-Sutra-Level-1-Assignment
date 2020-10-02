package Level1;
//Write a java program to find Fibonacci series from 1 to 100.
public class _12Fibonacci {
    public static void main(String[] args) {

        int n = 100, x = 0, y = 1;

        System.out.print("Upto " + n + ": ");
        while (x <= n)
        {
            System.out.print(x + " + ");

            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}