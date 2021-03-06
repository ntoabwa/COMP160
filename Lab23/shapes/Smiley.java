/**Lab 23...Making the new class called Circle
  * which extends Shape and placed in the shapes package.
  */

package shapes;

import java.awt.*;

public class Smiley extends Shape{
  
  public Smiley(){
    this.height = 30;
    this.width = 30;
    this.x = x;
    this.y = y;
    
  }
  
  /**draw the shape
    @param g a Graphics object*/
    public void display (Graphics g){
      g.setColor(colour.yellow);
      g.fillOval(x, y, width, height);
      g.drawOval(x, y, width, height);
      g.setColor(colour.black);
      g.fillOval(x+7, y+8, 4, 4);
      g.setColor(colour.black);
      g.fillOval(x+20, y+8, 4, 4);
      
      if(moveY<0){
        g.drawArc(x+8, y+10, 15, 13, 190, 160);
      }else{ 
        g.drawArc(x+8, y+15, 15, 13, 350, 190);
      }
      
      
    }
}


