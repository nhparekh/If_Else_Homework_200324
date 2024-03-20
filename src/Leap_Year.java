import java.util.Scanner;
//this class is to identify leap year
public class Leap_Year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");

        int yer = scanner.nextInt();
        String result = (yer % 4 == 0) ? "Leap year" : "Not a Leap year";
        System.out.println("year is : " + result);
    }
    }
