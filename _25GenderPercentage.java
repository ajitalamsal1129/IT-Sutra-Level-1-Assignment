package src.Level1;

import java.util.Scanner;

//Write a java program to find gender percentage
public class _25GenderPercentage {
    public static void main(String[] args) {
        int women,sum,mp,fp;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the total number of students");
      int total=scan.nextInt();
      System.out.println("Enter the total number of men");
        int men=scan.nextInt();
        {
            women=total-men;
            mp=(men*100)/total;
            fp=(women*100)/total;

        }
        System.out.println("Total number of women is: "+women);
        System.out.println("Percentage of men is:" +mp);
        System.out.println("Percentage of women is:" +fp);



    }
}


