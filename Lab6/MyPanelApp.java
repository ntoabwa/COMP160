/* Application class for MyPanel class*/

import java.awt.Color;

public class MyPanelApp {
  
  public static void main(String [] args) {
    MyPanel mp1 = new MyPanel ();
    mp1.decorate (java.awt.Color.blue, 180);
                                                                                                                                                                                                                                                
  
    MyPanel mp2 = new MyPanel ();
    mp2.decorate (Color.yellow, 450);
  }
}