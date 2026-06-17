import java.util.*;
public class Program7_SmallestLargest {
    static int[] findSmallestAndLargest(int a,int b,int c){
        return new int[]{Math.min(a,Math.min(b,c)), Math.max(a,Math.max(b,c))};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int[] ans=findSmallestAndLargest(a,b,c);
        System.out.println("Smallest = "+ans[0]);
        System.out.println("Largest = "+ans[1]);
    }
}