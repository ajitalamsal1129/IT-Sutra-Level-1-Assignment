package src.Level1;

import java.util.Scanner;

//Write a java program to create console app for restaurant
public class _24ConsoleApp {
    public static void main(String[] args) {
        int tx = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items?");
        int items = scan.nextInt();
        System.out.println("Enter price for item 1:");
        int i1 = scan.nextInt();
        System.out.println("Enter price for item 2:");
        int i2 = scan.nextInt();
        System.out.println("Enter price for item 3:");
        int i3 = scan.nextInt();
        if (i3 == 100) {
            System.out.println("Your bill:" + "\nPrice:" + i3 + "\nTax:" + tx * 100 / i3);
            System.out.println("Enter tip?");


        }

        boolean a = true;
        while (a) {

            System.out.println("Enter 1 for yes");
            System.out.println("Enter 2 for no");
             int opt= scan.nextInt();
             switch (opt)
             {
                 case 1:
                     System.out.println("Enter the tip amount");
                     int tip=scan.nextInt();
                     System.out.println("Your bill:" +(i3 +tx +tip));
                     break;

                 case 2:
                     System.out.println("Your bill:" +(i3 +tx));
                     System.exit(0);


             }


        }
        }


    }




