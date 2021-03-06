/**COMP160 ....Lab21
  * 
  */
package shapes;

import java.util.Random;
import java.awt.*;
public class Shape{
  
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  /**Constructor for Shape*/
  public Shape() {
    Random generator = new Random();
    this.width = generator.nextInt(21) + 10; 
    this.height = width;
    this.x = generator.nextInt(400-width);
    this.y = generator.nextInt(400-height);
    this.colour = new Color (generator.nextInt(256), generator.nextInt(256),generator.nextInt(256));
    
  }
  
  /**method which returns random numbers*/
  public int randomRange(int lo, int hi){
    Random generator = new Random();
    return generator.nextInt(hi-lo+1) + lo;
    
  }
  
  /**draw the shape
 @param g a Graphics object*/
  public void display (Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
    
  }
  
  
  
  
  
}