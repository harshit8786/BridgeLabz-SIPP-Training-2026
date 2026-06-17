import java.util.*;
public class Program8_Friends {
    static int youngest(int[] age){
        int idx=0;
        for(int i=1;i<3;i++) if(age[i]<age[idx]) idx=i;
        return idx;
    }
    static int tallest(double[] h){
        int idx=0;
        for(int i=1;i<3;i++) if(h[i]>h[idx]) idx=i;
        return idx;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] h=new double[3];
        for(int i=0;i<3;i++){ age[i]=sc.nextInt(); h[i]=sc.nextDouble(); }
        System.out.println("Youngest="+names[youngest(age)]);
        System.out.println("Tallest="+names[tallest(h)]);
    }
}