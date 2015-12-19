
package cylindertester;


/**
 *
 * @author Aashka Patel
 */

public class Cylinder {
    double height;  
    double diameter; 
    
    Cylinder (double height, double diameter){ //constructor

    }
   
  //volume formula
     public double getVolume(double height, double diameter) {
        double radius = diameter/2; 
        double vol = radius * radius* Math.PI *height ;
        return  vol;
    }
     //surface area formula 
      public double getSA(double height, double diameter) {
       double radius = diameter/2; 
       double r2 = radius *radius; 
       double sa = (2*Math.PI*radius*height) + (2*Math.PI*r2) ;
       return sa;
    }
  }