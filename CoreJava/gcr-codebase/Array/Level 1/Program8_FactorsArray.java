import java.util.*;
public class Program8_FactorsArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0) factors.add(i);
        }

        System.out.println("Factors:");
        for(int f:factors) System.out.print(f+" ");
    }
}