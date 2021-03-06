import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**Making a support class of MyAppClass
  * called TrafficLightPanel class.
  * Lab 18
  */
public class TrafficLightPanel extends JPanel{
  
  private JButton redButton, amberButton, greenButton;
  private JLabel buttonLabel, lastPressedLabel;
  private JPanel buttonPanel;
  
  /**constructor which sets up and adds components needed to */
  public TrafficLightPanel(){
    redButton = new JButton ("Red");
    amberButton = new JButton ("Amber");
    greenButton = new JButton ("Green");
    
    ButtonListener listener = new ButtonListener ();
    redButton.addActionListener (listener);
    amberButton.addActionListener (listener);
    greenButton.addActionListener (listener);
    
    buttonLabel = new JLabel ("Button Panel");
    
    lastPressedLabel = new JLabel ("last pressed");
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension (80, 290) );
    buttonPanel.setBackground(Color.white);
    
    
    buttonPanel.add(buttonLabel);
    
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    
    buttonPanel.add(lastPressedLabel);
    
    
    setPreferredSize(new Dimension (200, 300) );
    setBackground(Color.blue);
    
    add(buttonPanel);
    
    LightPanel lighter = new LightPanel();
    add(lighter);
    
  }
  
  /**Represents the action listener class which sets the color and text of the Panel 
    * depending on which button is pressed. */
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent event){
      if(event.getSource() == redButton){
        lastPressedLabel.setText("red");
        
        
      }else{
        if(event.getSource() == greenButton){
          lastPressedLabel.setText("green");
          
          
        }
        
        else{
          
          lastPressedLabel.setText("amber");
          
        }
      }
      
      repaint();
      
    }
  }
  
  /**Class that draw circles which matches the Buttons and enable them to
    * change color if their buttons are pressed.*/
  private class LightPanel extends JPanel{
    
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      page.setColor (Color.black);
      page.fillOval (20, 20, 40, 40);
      page.fillOval (20, 90, 40, 40);
      page.fillOval (20, 160, 40, 40);
      
      if(lastPressedLabel.getText().equals("red")){
        page.setColor (Color.red);
        page.fillOval (20, 20, 40, 40);
      }
      
      if(lastPressedLabel.getText().equals("amber") ){
        page.setColor (Color.orange);
        page.fillOval (20, 90, 40, 40);      
      }
      
      if(lastPressedLabel.getText().equals("green") ){
        page.setColor (Color.green);
        page.fillOval (20, 160, 40, 40);
      }
    
 
      
    }
    
    
    
    public LightPanel(){
      setPreferredSize(new Dimension (80, 290) );
      setBackground(Color.cyan);
      
    }
    
    
  }
  
  
  
  
}