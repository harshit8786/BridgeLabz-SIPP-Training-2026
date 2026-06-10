// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result
import java.util.*;

public class NaturalSumComparisonFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();

        if (number>=0){
            int sumUsingFormula=number*(number+1)/2;
            int sumUsingLoop=0;

            for (int counter=1; counter<=number; counter++) {
                sumUsingLoop+=counter;
            }

            System.out.println("The sum of "+number+" natural numbers using formula is: "+sumUsingFormula);
            System.out.println("The sum of "+number+" natural numbers using for loop is: "+sumUsingLoop);

            if (sumUsingFormula==sumUsingLoop) {
                System.out.println("Both computations are correct and yield the same result.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            System.out.println("The number "+number+" is not a natural number");
        }
        sc.close();
    }
}
