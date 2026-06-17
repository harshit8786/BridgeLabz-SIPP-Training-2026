import java.util.*;
public class Program10_WindChill {
    static double calculateWindChill(double t,double v){
        return 35.74 + 0.6215*t - 35.75*Math.pow(v,0.16) + 0.4275*t*Math.pow(v,0.16);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble(), v=sc.nextDouble();
        System.out.println(calculateWindChill(t,v));
    }
}