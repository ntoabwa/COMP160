import java.io.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
/** FilePanel.java
  * Lab 20, COMP160,  2017
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    
    
    String fileName = "LongBadData.txt";
    
    
    
    
    try {
      
      Scanner fileScan = new Scanner (new File (fileName) );
      
      while (fileScan.hasNextLine () && count<drawObjects.length){
        
        String inputLine = fileScan.nextLine();
        if(inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+") ){
          Scanner scan = new Scanner (inputLine);
          
          boolean fillB = false; 
          Color colour = Color.black;
          int fillInt = (scan.nextInt() );
          if(fillInt==1){
            fillB = true;
          }
          
          int colorInt = (scan.nextInt() );
          if(colorInt==1){
            colour = Color.red;
          }else if(colorInt==2){
            colour = Color.blue;
          } else{
            colour = Color.green;
          }
          
          
          int x = (scan.nextInt() );
          int y = (scan.nextInt() );
          int width = (scan.nextInt() );
          int height = (scan.nextInt() );
          
          
          drawObjects[count] = new Rectangle(fillB,colour, x, y,width,height);
          count++;
          
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1);
    }
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
