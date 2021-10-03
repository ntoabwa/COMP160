
package shapes;
/**COMP160 ....Lab22
  * 
  */

import java.util.Random;
import java.awt.*;


public abstract class Shape{
  
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  protected int moveX = 1, moveY = 1;
  
    /**Constructor for Shape which initialises data fields to random values*/
  public Shape() {
    Random generator = new Random();
    this.width =  randomRange(10, 30); 
    this.height = width;
    this.x = generator.nextInt(400-width);
    this.y = generator.nextInt(400-height);
    
    if(this.y>200){
      moveY = -moveY;
    }
    
    this.colour = new Color (generator.nextInt(256), generator.nextInt(256),generator.nextInt(256));
    
  }
  
  
  public void move(){
    Random generator = new Random();
    
    //if(width>15){
      y+=moveY;
    //}else{
      x+=moveX;
   // }
    
    if(x>=400-width||x<=0){
      moveX = -moveX;
      this.colour = new Color (generator.nextInt(256), generator.nextInt(256),generator.nextInt(256));
    }
    
    if(y>=400-height||y<=0){
      moveY = -moveY;
      this.colour = new Color (generator.nextInt(256), generator.nextInt(256),generator.nextInt(256));
    }
    
   
    
 }
  
  

  
  /**method which returns random numbers*/
  public int randomRange(int lo, int hi){
    Random generator = new Random();
    return generator.nextInt(hi-lo+1) + lo;
    
  }
  
  /**draw the shape
    @param g a Graphics object*/
    public abstract void display (Graphics g);
    
    
}