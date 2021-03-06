/** Comp160 
  * 
  * Lab 10
  * 
  * Song support class
  */

public class Song{
  
  private String songLine;      //Declares a string data field called songLine
  
  public Song(String sLine){   //Constructor which set the value of data field songLine
    songLine = sLine;
  }
  
  public String toString(){     //method which returns the value stored in songLine 
    return songLine;
  }
                                                                                                                                                                                                                                                                                                                                                                 
  public void process(){
                                                                                                                                                                                                                                                                                                                                           
    int space1 = songLine.indexOf(' ');            //Local interger variables storing the positions of the first
    int space2 = songLine.indexOf(' ', space1+1);  //and second space in songLine
    
    
    System.out.println("Length is: " + songLine.length() );                               //Length of songLine
    System.out.println("Last character is:" + songLine.charAt(songLine.length()-1));      //Last character in songLine
    
    
    if(space2!=-1){
      System.out.println("The first two words are:\n " + songLine.substring(0, space2 ) );         //First two words in songLine
      System.out.println("Remaining words are:\n " + songLine.substring(space2 + 1 ) );                 //Remaining words in songLine
      System.out.println("The first letter in third word is:\n "+ songLine.charAt(space2+1) );         //First letter in songLine
    }                   
    
    System.out.println("songLine in uppercase is:\n" + songLine.toUpperCase() );                                          //Prints                   out songLine in uppercase
             System.out.println("Replacing the space with x:\n" + songLine.replace(' ', 'x') );                                      //Replace the ' ' with 'x'
    System.out.println("The position of b is: " + songLine.indexOf('b') );                                           //Print out the positions of 'b'
    
    System.out.println(songLine);                                 //Check if songLine has changed through out the exercise
    
    
  }
  
  
  
  
  
  
  
        
}

                                     
