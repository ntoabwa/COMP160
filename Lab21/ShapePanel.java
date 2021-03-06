/**lab21
  * 
  * Lab 21...class which extends JPanel
  */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  private Shape[] shapes = new Shape[20];
  private JButton addShape = new JButton ("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count:");
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count;
  
  /**Constructor for ShapePanel*/
  public ShapePanel (){
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400) );
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    add(controlPanel);
    add(drawPanel);
    ButtonListener butLis = new ButtonListener();
    addShape.addActionListener(butLis);
    
  }
  
  
  /**main method which creates a frame*/
  public static void main (String[] ags){
    JFrame frame = new JFrame ();
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel() );
    frame.pack();
    frame.setVisible(true);
    
    
  }
  
  /**class which enables buttons to work*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent event){
      JButton whichButton = (JButton) event.getSource();
  
      if ("Add Shape".equals(whichButton.getText() ) ) {
        if(count<shapes.length){
          shapes[count] = new Shape();
          count++;
        }
        
      }
      showNum.setText(Integer.toString(count));
      
      drawPanel.repaint();
      
         
    }
  }
  
  /**class which sets up a drawing panel beside the controlPanel*/
  private class DrawingPanel extends JPanel{
    
    
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400) );
      setBackground(Color.pink);
      
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      for(int i = 0; i < count; i++){
        shapes[i].display(g);
     
      }
      
      
    }
    
  }
  
}