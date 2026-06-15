import java.util.*;
public class Program4_StoreNumbersAndSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        int index=0;
        while(true){
            double num=sc.nextDouble();
            if(num<=0 || index==10) break;
            arr[index++]=num;
        }
        double sum=0;
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}