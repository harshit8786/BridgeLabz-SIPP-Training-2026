import java.util.*;

public class EmployeeBonusEvaluator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService=sc.nextInt();

        if (yearsOfService>5) {
            double bonus=salary*0.05;
            System.out.println("The employee is eligible for a bonus of: "+bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        sc.close();
    }
}
