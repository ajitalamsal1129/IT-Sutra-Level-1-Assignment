package Level1;

import java.util.Scanner;

//Find if a given year is a leap year
public class _14LeapYear {
    public static void main(String[] args){
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}
