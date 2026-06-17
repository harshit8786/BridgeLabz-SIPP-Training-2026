import java.util.*;
public class Program9_ArrayCheck {
    static boolean isPositive(int n){ return n>=0; }
    static boolean isEven(int n){ return n%2==0; }
    static int compare(int a,int b){ return Integer.compare(a,b); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for(int x:arr){
            if(isPositive(x))
                System.out.println(isEven(x)?"Positive Even":"Positive Odd");
            else
                System.out.println("Negative");
        }
        System.out.println(compare(arr[0],arr[4]));
    }
}