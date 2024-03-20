import java.util.Scanner;

// add ,sub, multi and division according to their symbol
public class Number_symbol_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number-1");
        double num_1 = scanner.nextDouble();
        System.out.println("Enter symbol");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter number-2");
        double num_2 = scanner.nextInt();

        if (symbol == '+') {
            double add = num_1 + num_2;
            System.out.println("Result =" + add);
        }
        else if (symbol == '*') {
            double multi = num_1 - num_2;
            System.out.println("Result =" + multi);
        }
        else if (symbol == '/') {
            double divi = num_1 - num_2;
            System.out.println("Result =" + divi);
        }
else {
            System.out.println("invalid");
        }

//    }


    }
}
