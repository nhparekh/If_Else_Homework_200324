import java.util.Scanner;
// TO convert alphabet from a uppercase to lowercase
public class uppercase_andprint_lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input alphabet in uppercase");
        String alphabet = scanner.nextLine();

        String lower = alphabet.toLowerCase(); // To convert in lowercase
        System.out.println("alphabat in lowercase is " +lower);

    }

}
