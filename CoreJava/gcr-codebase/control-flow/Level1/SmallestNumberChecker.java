
import java.util.*;
public class SmallestNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        boolean isSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
}
