package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/** 
 * Lab 24...class which extends JPanel, creates ShapePanel and then add controlpanel and drawingpanel to it.
 */


public class ShapePanel extends JPanel{
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private JButton addShape = new JButton ("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel removeLabel = new JLabel("Remove which?");
  private DrawingPanel drawPanel = new DrawingPanel();
  private Timer timer;
  private final int DELAY = 10;
  private JButton[] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove") };
  
  
  
  /**Constructor for ShapePanel where the components are added it. */
  public ShapePanel (){
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400) );
    controlPanel.add(removeLabel);
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
  
  /**class which enables buttons to work and display different shapes on the panel*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent event){
      
      
      
      if(event.getSource()==timer ){
        for(int i = 0; i < shapes.size(); i++){
          shapes.get(i).move();
        }
      }else{
        
        JButton button = (JButton) event.getSource();
        
        if ("Circle".equals(button.getText() ) ) {
          shapes.add(new Circle());
        }
        else if ("Square".equals(button.getText() ) ) {
          shapes.add(new Square());
        }
        else if ("Oval".equals(button.getText() ) ) {
          shapes.add(new Oval());
        }
        else if ("Smiley".equals(button.getText() ) ) {
          shapes.add(new Smiley());
        }
        else if ("Swirl".equals(button.getText() ) ) {
          shapes.add(new Swirl());
        }
        else if ("Stop".equals(button.getText() ) ) {
          timer.stop();
        }else if ("Start".equals(button.getText() ) ) {
          timer.start();
        }else if ("Remove".equals(button.getText() ) ){
          try{
            int textValue = Integer.parseInt(showNum.getText());
            if(shapes.size()!=0){
              shapes.remove(textValue);
            }
          }catch(IndexOutOfBoundsException e){
            System.out.println("Improper code length");
          }catch(NumberFormatException e){ 
            System.out.println("Not a number");
          }
        }
      }
      if(shapes.size()!=0){
        showNum.setText(Integer.toString(shapes.size()-1));
      }else{
        showNum.setText("");
      }
      
      
      
      repaint();
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
      
      for(int i = 0; i < shapes.size(); i++){
        shapes.get(i).display(g);
        shapes.get(i).showIndex(g, i);
        
      }
      
      
    }
    
  }
  
}


