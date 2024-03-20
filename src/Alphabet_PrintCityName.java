import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;
// Print city name for alphabet A-F
public class Alphabet_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet =='A') {
            System.out.println("city name begins with A is ahmedabad");
        } else if (alphabet == 'b' || alphabet == 'B') {
            System.out.println("city name begins with B is  Bangalore");
        } else if (alphabet == 'c' || alphabet == 'C') {
            System.out.println("city name begins with C is Calcutta");
        } else if (alphabet == 'd' || alphabet == 'D') {
            System.out.println("city name begins with D is Denmark");
        } else if (alphabet == 'e' || alphabet == 'E') {
            System.out.println("city name begins with E is Edinburgh");
        } else if (alphabet == 'f' || alphabet == 'F') {
            System.out.println("city name begins with F is France");
        } else
            System.out.println("Invalid entry");
    }
}
