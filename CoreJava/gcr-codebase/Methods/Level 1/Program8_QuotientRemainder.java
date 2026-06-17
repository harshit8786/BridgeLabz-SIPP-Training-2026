import java.util.*;
public class Program8_QuotientRemainder {
    static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), d=sc.nextInt();
        int[] ans=findRemainderAndQuotient(n,d);
        System.out.println("Quotient = "+ans[0]);
        System.out.println("Remainder = "+ans[1]);
    }
}