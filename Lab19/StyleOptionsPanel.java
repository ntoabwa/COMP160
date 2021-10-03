//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JRadioButton courier, timesNewRoman, helvetica;
  private JLabel saying;
  private JCheckBox bold, italic;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel(){
    
    setLayout(new GridLayout(6,1) );
    
    courier = new JRadioButton("Courier");
    timesNewRoman = new JRadioButton("Times New Roman");
    helvetica = new JRadioButton(typeFace, true);
    
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    courier.addItemListener (listener);
    timesNewRoman.addItemListener (listener);
    helvetica.addItemListener (listener);
    
    add (saying);
    add (bold);
    add (italic);
    add (courier);
    add (timesNewRoman);
    add (helvetica);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 100));
    
    ButtonGroup group = new ButtonGroup();
    
    group.add(courier);
    group.add(timesNewRoman);
    group.add(helvetica);
    
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {    
    

    
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      typeFace = "Helvetica";
      
      if (courier.isSelected() )
        typeFace = "Courier";
      
      else if (timesNewRoman.isSelected() )
        typeFace = "Times New Roman";
      
      saying.setFont (new Font (typeFace, style, 20));
      
    }
  }
}
