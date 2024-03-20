import java.util.Scanner;

public class Saller_sales_commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales id");
        String sales_id = scanner.nextLine();
        System.out.println("Enter seller's Name");
        String sellers_name= scanner.nextLine();
        System.out.println("Enter sales amount");
        float sales_amount = scanner.nextFloat();
        System.out.println("Enter seller's salary basic");
        float salary_basic = scanner.nextFloat();

        System.out.println("Sales ID is:" +sales_id);
        System.out.println("Seller's name is:" +sellers_name);
        System.out.println("Seller's basic salary is:" +salary_basic);

        if(sales_amount >= 50000){
            float com_1 = ((sales_amount *35)/100);
            System.out.println("commission of sales amount is " + com_1);}
        else if (sales_amount >= 30000) {
            float com_2 = ((sales_amount *20)/100);
            System.out.println("commission of sales amount is " + com_2);}
        else if (sales_amount >= 20000) {
            float com_3 = ((sales_amount *10)/100);
            System.out.println("commission of sales amount is " + com_3);}
        else if (sales_amount >= 10000) {
            float com_4 = ((sales_amount *5)/100);
            System.out.println("commission of sales amount is " + com_4);}
        else if (sales_amount < 10000) {
            float com_5 = ((sales_amount *2)/100);
            System.out.println("commission of sales amount is " + com_5);}
        else {
            System.out.println("No commission");}








    }
}
