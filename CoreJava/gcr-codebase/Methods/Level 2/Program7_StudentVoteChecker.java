import java.util.*;
public class Program7_StudentVoteChecker {
    static boolean canStudentVote(int age){
        return age>=18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=sc.nextInt();
            System.out.println(canStudentVote(ages[i]));
        }
    }
}