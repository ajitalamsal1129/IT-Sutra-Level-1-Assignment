package src.Level1;

import java.util.Scanner;

//Write a java program to input 10 numberw from keyword and find how many are odd, even and thiir sum and average
public class _18OddEvenSumAvg {
    public static void main(String[] args) {
        int i, sum = 0;
        double avg = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 10 numbers:");
        for (i=0;i<10;i++){
        int num = scan.nextInt();
        sum += num;
            avg = sum / 10;
        }
             System.out.println("The sum of 10 no. is : " + sum + "\nThe Average is : " + avg);

        }

    }

