package Level2;
import java.util.*;
public class DivisionDetails {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1=sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2=sc.nextDouble();
        double quotient=number1/number2;
        double reminder=number1%number2;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
        sc.close();
    }
}
