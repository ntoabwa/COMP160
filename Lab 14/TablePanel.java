import javax.swing.*;
import java.awt.*;
/** Lab 14 The TablePanel class which is an extension
  * of the JPanel class
  */

public class TablePanel extends JPanel{
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  /**Consist of constructors for creating each diner object
    *and their background*/
  public TablePanel(){
    diner1 = new Diner (200, 260, "Anne", 1, Color.red);
    diner2 = new Diner (270, 180, "Tom", 2, Color.orange);
    diner3 = new Diner (270, 90, "Jade", 3, Color.green);
    diner4 = new Diner (150, 180, "John", 4, Color.white);  
    diner5 = new Diner (150, 90, "Dog", 5, Color.yellow); 
    diner6 = new Diner (200, 40, "Cat", 6, Color.blue);
    
    setPreferredSize (new Dimension(600,300) );
    setBackground (Color.pink);
    
  }
  
  /**paintComponent method that draw each diner by calling each
    *diner object*/
  public void paintComponent (Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor(Color.white);
    g.fillRect(200, 90 , 70, 150);  
    
    
    
    
  }
  
  
  
  
}
