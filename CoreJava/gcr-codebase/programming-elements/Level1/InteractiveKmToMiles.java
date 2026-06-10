import java.util.*;
public class InteractiveKmToMiles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double distanceInKm=sc.nextDouble();
        double kmPerMile=1.6;
        double distanceInMiles=distanceInKm/kmPerMile;
        System.out.println("The total miles is "+distanceInKm+" mile for the given "+distanceInMiles+"km");
        sc.close();
    }
}
