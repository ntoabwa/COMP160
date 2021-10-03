import java.awt.*;
/**COMP160...lab14
  * 
  *Class Diner
  */

public class Diner{
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
  /**Constructor which set up the values of the data fields*/
  public Diner(int x, int y, String name, int seatNum, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    this.colour = colour;
    
  }
  
  /**method that draws each diner*/
  public void draw(Graphics g){
    g.setColor (colour);
    g.fillOval (x,y,DIAMETER, DIAMETER);
    g.setColor (Color.black);
    g.drawString(name, x+5, y+30);
    g.setFont (new Font ("Times New Roman", Font.PLAIN, 16) );
    g.setColor (Color.black);
    g.drawString (Integer.toString(seatNum), x+13 ,y+18) ;
    
    
    
    
    
    
  }
  
}

