import java.util.Scanner;
//this class is to identify even or odd number
public class Odd_Even_Number {
    public static void main(String[] args) {
        Scanner scanner_1 = new Scanner(System.in);
        System.out.println("Enter any number (No.1)");

        int num_1 = scanner_1.nextInt();
        String result_1 = (num_1 % 2 == 0) ? "Even" : "Odd";
        System.out.println("number is : "+ result_1 );

        Scanner scanner_2 = new Scanner(System.in);
        System.out.println("Enter any number (No.2)");

        int num_2 = scanner_2 .nextInt();
        String result_2 = (num_2 % 2 == 0) ? "Even" : "Odd";
        System.out.println("number is : "+ result_2);



    }
}
