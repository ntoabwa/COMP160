package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** 
  * Lab 22...class which extends JPanel
  */


public class ShapePanel extends JPanel{
  private Shape[] shapes = new Shape[20];
  private JButton addShape = new JButton ("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count:");
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count;
  private JButton start = new JButton("Start");
  private JButton stop = new JButton("Stop");
  private Timer timer;
  private final int DELAY = 10;
  
  /**Constructor for ShapePanel*/
  public ShapePanel (){
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400) );
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    controlPanel.add(start);
    controlPanel.add(stop);
    
    add(controlPanel);
    add(drawPanel);
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    start.addActionListener(listener);
    stop.addActionListener(listener);
    
    timer = new Timer(DELAY, listener);
    
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
        JButton whichButton = (JButton) event.getSource();
        
        if ("Add Shape".equals(whichButton.getText() ) ) {
          if(count<shapes.length){
            shapes[count] = new Shape();
            count++;
          }
          
        }
      }
      showNum.setText(Integer.toString(count));
      
      drawPanel.repaint();
      
      if(event.getSource()==stop ){
        timer.stop();
      }else if(event.getSource()==start ){
        timer.start();
      }
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