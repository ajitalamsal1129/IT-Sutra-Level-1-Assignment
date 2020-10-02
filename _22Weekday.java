package src.Level1;

import java.util.Scanner;

//Write a java program that keeps the number from the userand generates an integer between 1 and 7
// and generates the name of the weekday
public class _22Weekday {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = scan.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return  dayName;
    }
}

