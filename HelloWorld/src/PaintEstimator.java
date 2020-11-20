import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double numGallons;
      int numCans; 
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();                    
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;                        
      System.out.println("Wall area: " + wallArea + " square feet");     
      
      numGallons = wallArea / 350; 
      System.out.println("Paint needed: " + numGallons + " gallons"); 
      
      numCans = (int)Math.ceil(numGallons); 
      System.out.println("Cans needed: " + numCans + " can(s)");  
   }
}