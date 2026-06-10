public class EarthVolume {
    public static void main(String[] args){
        int radiusInKm=6378;
        double kmPerMile=1.6;
        double radiusInMiles=radiusInKm/kmPerMile;
        double piValue=Math.PI;
        double volumeInCubicKm=(4/3)*piValue*Math.pow(radiusInKm, 3);
        double volumeInCubicMiles=(4/3)*piValue*Math.pow(radiusInMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is "+volumeInCubicKm+" and cubic miles is "+volumeInCubicMiles);
    }
    
}
