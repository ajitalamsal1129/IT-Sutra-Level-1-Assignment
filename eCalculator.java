package Level1;
//Write a java program to create a calculator which has functions like add,substract, multipliocation and division.
//add or skip the tip.
import java.util.Scanner;

public class eCalculator {
    public static void main(String[] args) {
        int x, y,add,sub,mul,div;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Calculator:" +"\n1.Add" + "\n2.Sub " + "\n3.Mul" + "\n4.Div" + "\n5.Quit");
        System.out.println("Enter first number:");
        x=scan.nextInt();
        System.out.println("Enter Second number:");
        y=scan.nextInt();
        while (true)
         {
             System.out.println("Enter 1 for addition");
             System.out.println("Enter 2 for substraction");
             System.out.println("Enter 3 for Multiplication");
             System.out.println("Enter 4 for division");
             System.out.println("Enter 5 for quit");
             int opt=scan.nextInt();
             switch (opt)
             {
                 case 1:
                     add=x+y;
                     System.out.println("Result:" +add);
                     break;

                 case 2:
                     sub=x-y;
                     System.out.println("Result:" +sub);
                     break;

                 case 3:
                     mul=x*y;
                     System.out.println("Result:" +mul);
                     break;

                 case 4:
                     div=x/y;
                     System.out.println("Result:" +div);
                     break;

                 case 5:
                     System.exit(0);




             }







         }


    }
}