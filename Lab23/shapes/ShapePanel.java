package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** 
 * Lab 23...class which extends JPanel, creates ShapePanel and then add controlpanel and drawingpanel to it.  
 */


public class ShapePanel extends JPanel{
  private Shape[] shapes = new Shape[20];
  private JButton addShape = new JButton ("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count:");
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count;
  private Timer timer;
  private final int DELAY = 10;
  private JButton[] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop") };
  
  
  
  /**Constructor for ShapePanel*/
  public ShapePanel (){
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400) );
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    
    
    add(controlPanel);
    add(drawPanel);
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    
    
    timer = new Timer(DELAY, listener);
    
    for(JButton eachbutton: buttons){
      eachbutton.addActionListener(listener);
      controlPanel.add(eachbutton);
    }
    
    
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
      
      if(event.getSource()==timer ){
        for(int i = 0; i < count; i++){
          shapes[i].move();
        }
        
      }else{
        
        JButton button = (JButton) event.getSource();
        
        if ("Circle".equals(button.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Circle();
            count++;
          }
          
        }
        
        if ("Square".equals(button.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Square();
            count++;
          }
          
          
          
        }
        
        if ("Oval".equals(button.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Oval();
            count++;
          }
          
        }
        
        if ("Smiley".equals(button.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Smiley();
            count++;
          }
          
        }
        
        if ("Swirl".equals(button.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Swirl();
            count++;
          }
          
        }
        
        if ("Stop".equals(button.getText() ) ) {
          if(count<shapes.length){
            timer.stop();
            
          }
          
        }
        
        if ("Start".equals(button.getText() ) ) {
          if(count<shapes.length){
            timer.start();
            
          }
          
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

