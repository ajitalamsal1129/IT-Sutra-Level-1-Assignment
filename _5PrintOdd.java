package Level1;
//Write a java program to print the odd numbers and its count from 1 to 99.
public class _5PrintOdd {
    public static void main(String[] args){
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}


