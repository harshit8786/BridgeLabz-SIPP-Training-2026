import java.util.*;
public class Program5_Table6To9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] result=new int[4];
        int idx=0;
        for(int i=6;i<=9;i++) result[idx++]=number*i;
        idx=0;
        for(int i=6;i<=9;i++)
            System.out.println(number+" * "+i+" = "+result[idx++]);
    }
}