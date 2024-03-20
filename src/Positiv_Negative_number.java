import java.util.Scanner;

public class Positiv_Negative_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num < 0)
            System.out.println("this number is negative");
        else if (num > 0)
            System.out.println("this number is positive");
        else
            System.out.println("this number is 0");
    }
}
