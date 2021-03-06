import javax.swing.JFrame;
/**Application class which makes a JFrame containing 
  * an instance of a class called TrafficLightPanel
  * ...COMP160..Lab18
  */

public class MyAppClass{
  
  /**Creates and displays the main program frame*/
  public static void main(String [] args){
    JFrame frame = new JFrame("Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    TrafficLightPanel panel = new TrafficLightPanel();
    frame.getContentPane().add(panel);
    
    frame.pack();
    frame.setVisible(true);
  }
}