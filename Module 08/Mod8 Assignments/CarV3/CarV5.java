
/**
 * A program that calculates mpg and distance
 * 
 * @author David Johnson
 * @version 11/18/14
 */
public class CarV5{
   
   //calculating the distance
   public static double distance(double milesStart, double milesEnd){
   
       double total = 0;
       total = milesEnd - milesStart;
       
       return total;
   
   }
    
   //calculating the mpg
   public static double mpgcalc(double milesStart, double milesEnd, double gallons){
   
       double total = 0;
       total = milesEnd - milesStart;
       total = total / gallons;
       
       return total;
       
   }
    
   public static void main(String[ ] args){
       
       //declaring vars
       double milesStart = 100, milesEnd = 120, gallons = 10, MPG = 0, distance = 0;
       String type = "09 Scion XB";
       
       //running the methods
       MPG = mpgcalc(milesStart,milesEnd,gallons);
       distance = distance(milesStart,milesEnd);
       
       //printing out into friendly format
       System.out.println("                         Gas Mileage Calculations");
       System.out.println();
       System.out.printf("%13s%15s%15s%15s%15s%15s\n", "Type of Car" , "Start Miles" , "End Miles" , "Distance" , "Gallons" , "Miles/Gal");
       System.out.println("===========================================================================================");
       System.out.printf("%13s%11.2f%16.2f%15.2f%15.2f%15.2f", type , milesStart , milesEnd , distance , gallons, MPG);
       
   }
    
}