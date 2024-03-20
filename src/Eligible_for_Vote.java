import java.util.Scanner;
//Eligible for vote based on age
public class Eligible_for_Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int Age = scanner . nextInt();

        if (Age >= 18) {
            System.out.println("eligible for vote");
        }
        else
            System.out.println("not eligible for vote");


    }
}
