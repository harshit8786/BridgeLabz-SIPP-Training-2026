import java.util.*;
public class Program2_RecursiveSum {
    static int recursiveSum(int n){
        if(n==1) return 1;
        return n+recursiveSum(n-1);
    }
    static int formulaSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Recursive="+recursiveSum(n));
        System.out.println("Formula="+formulaSum(n));
    }
}