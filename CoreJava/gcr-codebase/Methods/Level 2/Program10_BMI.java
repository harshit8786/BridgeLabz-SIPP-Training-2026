import java.util.*;
public class Program10_BMI {
    static double bmi(double w,double hcm){
        double hm=hcm/100.0;
        return w/(hm*hm);
    }
    static String status(double bmi){
        if(bmi<=18.4) return "Underweight";
        if(bmi<=24.9) return "Normal";
        if(bmi<=39.9) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
            data[i][2]=bmi(data[i][0],data[i][1]);
        }
        for(int i=0;i<10;i++){
            System.out.printf("Weight=%.2f Height=%.2f BMI=%.2f Status=%s%n",
            data[i][0],data[i][1],data[i][2],status(data[i][2]));
        }
    }
}