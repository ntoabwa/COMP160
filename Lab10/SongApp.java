/**Comp160
  * 
  * Lab 10
  * 
  * Application class for Song
  */

public class SongApp{

  public static void main (String [] args){
     
    Song mySong = new Song("While my guiter gently weeps");  //constructor 
    Song mySong1 = new Song("Let it be");
    Song mySong2 = new Song("Penny Lane");
    
    System.out.println(mySong.toString()); 
    mySong.process();
    
    System.out.println(mySong1.toString());
    mySong1.process();
    
    System.out.println(mySong2.toString());
   mySong2.process();
    
    
    
  }




}
  
  