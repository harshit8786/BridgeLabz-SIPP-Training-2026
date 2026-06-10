package Level2;
import java.util.*;
public class TriangleAreaCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double baseInCm=sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double heightInCm=sc.nextDouble();
        double areaInSquareCm=0.5*baseInCm*heightInCm;
        double areaInSquareInches=areaInSquareCm/6.4516;
        System.out.println("The Area of the triangle in sq cm is "+areaInSquareCm+" and sq in is "+areaInSquareInches);
        sc.close();
    }
}
