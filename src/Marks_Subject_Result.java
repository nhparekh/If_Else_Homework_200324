import java.util.Scanner;
// this class is to input student name, roll no. & marks for 3 subjects to get the result of percentage, pass/fail and grade
// Student to get above 35 in a subject to Pass

public class Marks_Subject_Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No.");
        int rollno = scanner.nextInt();

        System.out.println("Enter Marks for Subject 1");
        int sub1_marks = scanner.nextInt();
        System.out.println("Enter Marks for Subject 2");
        int sub2_marks = scanner.nextInt();
        System.out.println("Enter Marks for Subject 3");
        int sub3_marks = scanner.nextInt();

        float total_marks = sub1_marks + sub2_marks + sub3_marks;
        System.out.println("Name:" +name);
        System.out.println("Roll No.:" +rollno);
        System.out.println("Total Marks : "+ total_marks );

        float percentage = ((total_marks / 300)*100);
        System.out.println("Percentage : "+ percentage+"%");

// To check every subject scored above 35
      if (sub1_marks>=35 && sub2_marks>=35 && sub3_marks>=35 && percentage >= 35 && percentage <50)
        {
            System.out.println("Result is : PASS");
            System.out.println("Grade is : C" );
        }
        else if (sub1_marks>=35 && sub2_marks>=35 && sub3_marks>=35 && percentage >= 50 && percentage <60)
        {
            System.out.println("Result is : PASS");
            System.out.println("Grade is : B" );
        }
        else if (sub1_marks>=35 && sub2_marks>=35 && sub3_marks>=35 && percentage >= 60 && percentage <80)
        {
            System.out.println("Result is : PASS");
            System.out.println("Grade is : A" );
        }
        else if (sub1_marks>=35 && sub2_marks>=35 && sub3_marks>=35 && percentage >= 80)
        {
            System.out.println("Result is : PASS");
            System.out.println("Grade is : A+" );
        }
        else
        {
            System.out.println("Result is : FAIL");
        }
    }


}
