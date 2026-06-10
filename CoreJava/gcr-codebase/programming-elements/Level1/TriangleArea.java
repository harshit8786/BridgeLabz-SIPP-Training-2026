import java.util.*;
public class TriangleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches=sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches=sc.nextDouble();
        double areaInSquareInches=0.5*baseInInches*heightInInches;
        double areaInSquareCm=areaInSquareInches*6.4516;
        System.out.println("Your Height in cm is"+areaInSquareCm+" and inches is "+areaInSquareInches);
        sc.close();
    }
    
}
