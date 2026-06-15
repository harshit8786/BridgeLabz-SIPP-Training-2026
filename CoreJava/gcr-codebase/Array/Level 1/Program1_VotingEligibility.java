import java.util.*;
public class Program1_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<10;i++) ages[i]=sc.nextInt();

        for(int age: ages){
            if(age<0) System.out.println("Invalid age");
            else if(age>=18) System.out.println("The student with age "+age+" can vote.");
            else System.out.println("The student with age "+age+" cannot vote.");
        }
    }
}