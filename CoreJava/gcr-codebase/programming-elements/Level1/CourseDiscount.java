public class CourseDiscount {
    public static void main(String[] args){
        int originalPrice=125000;
        int discountPercentage=10;
        int discountAmount=(originalPrice*discountPercentage)/100;
        int discountedPrice=originalPrice-discountAmount;
        System.out.println("The Discount Amount is INR "+discountAmount+" and the final Discounted Price is INR "+discountedPrice);
    }
    
}
