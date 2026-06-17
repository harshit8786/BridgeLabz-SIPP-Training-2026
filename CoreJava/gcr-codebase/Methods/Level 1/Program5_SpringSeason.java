import java.util.*;
public class Program5_SpringSeason {
    static boolean isSpring(int month,int day){
        return (month==3 && day>=20) || (month>3 && month<6) || (month==6 && day<=20);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), d=sc.nextInt();
        System.out.println(isSpring(m,d) ? "Its a Spring Season" : "Not a Spring Season");
    }
}