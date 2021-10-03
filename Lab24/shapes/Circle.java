/**Lab 23...Making the new class called Circle
  * which extends Shape and placed in the shapes package.
  */

package shapes;

import java.awt.*;

public class Circle extends Shape{
  
  
  
  
  
   /**draw the shape
    @param g a Graphics object*/
    public void display (Graphics g){
      g.setColor(colour);
      g.fillOval(x, y, width, height);
      
    }
    


}