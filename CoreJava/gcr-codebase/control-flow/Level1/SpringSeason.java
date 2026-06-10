import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month=sc.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day=sc.nextInt();

        boolean isSpringSeason=(month==3&&day>=20)||(month>3&&month<6)||(month==6&&day<=20);

        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        sc.close();
    }
}
