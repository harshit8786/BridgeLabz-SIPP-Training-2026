import java.util.*;
public class Program9_Chocolates {
    static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt(), children=sc.nextInt();
        int[] ans=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each child gets = "+ans[0]);
        System.out.println("Remaining chocolates = "+ans[1]);
    }
}