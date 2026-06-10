import java.util.*;

public class InteractiveSumUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double userInput;

        do {
            System.out.print("Enter a number (0 to stop): ");
            userInput=sc.nextDouble();
            total+=userInput;
        } while (userInput != 0);

        System.out.println("The sum of the numbers entered is: " + total);
        sc.close();
    }
    
}
