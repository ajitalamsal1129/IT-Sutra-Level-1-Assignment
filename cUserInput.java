package Level1;
//Take user input for name and convert the name to small letter
import java.util.Scanner;

public class cUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println(userName.toLowerCase());  // Output user input
    }
}

