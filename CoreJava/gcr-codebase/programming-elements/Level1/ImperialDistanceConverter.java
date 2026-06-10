import java.util.*;
public class ImperialDistanceConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet=sc.nextDouble();
        double feetPerYard=3;
        double yardsPerMile=1760;
        double distanceInYards=distanceInFeet/feetPerYard;
        double distanceInMiles=distanceInYards/yardsPerMile;
        System.out.println("Your Distance in feet is "+distanceInFeet+" while in yards is "+distanceInYards+" and miles is "+distanceInMiles);
        sc.close();
    }    
}
