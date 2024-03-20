import java.util.Scanner;
//To find average of five numbers
public class Find_Average_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any five numbers");
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int num_4 = scanner.nextInt();
        int num_5 = scanner.nextInt();

        float average = (num_1+num_2+num_3+num_4+num_5)/5;

        System.out.println("Average value of five numbers is:" +average);

    }
}
