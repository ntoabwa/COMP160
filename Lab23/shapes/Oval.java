/**Lab 23...Making the new class called Oval
  * which extends Shape.
  */
package shapes;

import java.awt.*;

public class Oval extends Shape{
  
  
  public Oval(){
   
   this.height = 4*width;
   this.y = height;
   
  
  }

   /**draw the shape
    @param g a Graphics object*/
    public void display (Graphics g){
      g.setColor(colour);
      g.fillOval(x, y, width, height);
      
    }
    



}