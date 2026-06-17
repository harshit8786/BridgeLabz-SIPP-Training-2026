import java.util.*;
public class Program12_RandomNumbers {
    static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++) arr[i]=1000+(int)(Math.random()*9000);
        return arr;
    }
    static double[] findAverageMinMax(int[] arr){
        int min=arr[0],max=arr[0],sum=0;
        for(int x:arr){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        return new double[]{(double)sum/arr.length,min,max};
    }
    public static void main(String[] args){
        int[] arr=generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findAverageMinMax(arr)));
    }
}