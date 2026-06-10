// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
import java.util.*;
public class FactorialCalculatorFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number=sc.nextInt();

        if (number<0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial=1;

            for (int counter=1; counter<=number; counter++) {
                factorial*=counter;
            }

            System.out.println("The factorial of "+number+" is: "+factorial);
        }
        sc.close();
    }
}
