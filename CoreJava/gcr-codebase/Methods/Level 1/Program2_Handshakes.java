import java.util.*;
public class Program2_Handshakes {
    static int handshakes(int n){ return (n*(n-1))/2; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(handshakes(n));
    }
}