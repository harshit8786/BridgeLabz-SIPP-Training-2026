import java.util.*;
public class HeightConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height in centimeters: ");
        double heightInCm=sc.nextDouble();
        double cmPerInch=2.54;
        int inchesPerFoot=12;
        double totalInches=heightInCm/cmPerInch;
        int heightInFeet=(int)(totalInches/inchesPerFoot);
        double remainingInches=totalInches%inchesPerFoot;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+remainingInches);
        sc.close();
    }
}
