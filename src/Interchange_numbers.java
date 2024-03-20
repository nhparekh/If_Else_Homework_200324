import java.util.Scanner;
// Enter two numbers and interchange
public class Interchange_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 1");
        int num_1 = scanner.nextInt();
        System.out.println("Enter value 2");
        int num_2 = scanner.nextInt();

        System.out.println("Before Interchange: Value 1 = " +num_1+ " and Value 2 = " +num_2);
//To interchange numbers
        int temp = num_1;
        num_1 = num_2;
        num_2 = temp;

        System.out.println("After Interchange: Value 1 = "+num_1+ " and Value 2 = " +num_2);

    }
}
