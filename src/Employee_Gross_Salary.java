import java.util.Scanner;
//To find employee gross salary including HRA, TA, DA and PF
public class Employee_Gross_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String emp_id = scanner.nextLine();
        System.out.println("Enter Employee Name");
        String emp_name = scanner.nextLine();
        System.out.println("Enter Employee's Basic Salary");
        float basic_salary = scanner.nextFloat();

        float HRA = ((basic_salary*10)/100);
        float TA = ((basic_salary*9)/100);
        float DA = ((basic_salary*8)/100);
        float PF = ((basic_salary*20)/100);
        float gross_salary = basic_salary+HRA+TA+DA-PF;

        System.out.println("Employee name:"+emp_name);
        System.out.println("HRA:"+HRA);
        System.out.println("TA:"+TA);
        System.out.println("DA:"+DA);
        System.out.println("PF:"+PF);
        System.out.println("Employee's Gross Salary is:"+gross_salary);
    }
}
