package Level2;
import java.util.*;
public class DistanceConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet=sc.nextDouble();
        double feetPerYard=3;
        double yardsPerMile=1760;
        double distanceInYards=distanceInFeet/feetPerYard;
        double distanceInMiles=distanceInYards/yardsPerMile;
        System.out.println("The distance in yards is "+distanceInYards+" while the distance in miles is "+distanceInMiles);
        sc.close();
    }
}
