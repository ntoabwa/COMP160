/**Lab 23...Making the new class called Circle
  * which extends Shape.
  */
package shapes;

import java.awt.*;

public class Square extends Shape{

   /**draw the shape
    @param g a Graphics object*/
    public void display (Graphics g){
      g.setColor(colour);
      g.drawRect(x, y, width, height);
      
    }
    



}