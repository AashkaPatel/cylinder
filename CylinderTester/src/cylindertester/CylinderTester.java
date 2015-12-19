/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindertester;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Krishna
 */
public class CylinderTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner blah = new Scanner (System.in); 
        DecimalFormat volume1 = new DecimalFormat ("00.00");
        DecimalFormat surfaceArea1 = new DecimalFormat ("00.00");
         
      
        System.out.println("What is the height of your cylinder (in cm)?");
        double height = blah.nextDouble();
        
        System.out.println("What is the diameter of your cylinder (in cm)?");
        double diameter = blah.nextDouble();
        
        
        Cylinder soda1 = new Cylinder(height,diameter);
         
          double volume = soda1.getVolume(height,diameter);
          System.out.println("The volume is: " + volume1.format(volume));
          
          double surfaceArea = soda1.getSA(height,diameter);
          System.out.println("The surface area is: " + surfaceArea1.format(surfaceArea));
    }
    
}
