import javax.swing.*;
/**Lab14...Application class
  * 
  */

public class TablePanelApp{
  
  /**creates a JFrame object and adds a new instance of the TablePanel to it*/
  public static void main (String[] ags){
    JFrame frame = new JFrame ();
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel() );
    frame.pack();
    frame.setVisible(true);
    
    
    
    
    
    
  }
  
  
  
}