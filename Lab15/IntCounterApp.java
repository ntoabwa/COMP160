import java.util.Scanner;
import java.util.Random;
/**Comp160..Lab15
  * 
  * Application class
  */

public class IntCounterApp{
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    for(int i=0; i<3; i++){
      System.out.println("\nWhich number do you wish to find?");
      int myTarget = scan.nextInt();
      
      IntCounter intcount1 = new IntCounter(makeArray());
      intcount1.showTarget(myTarget);
    } 
    System.out.println("\nFinished");
    
    
    
    
    
  }
  
  public static int[] makeArray(){ 
    Random generator = new Random();
    int [] myArray = new int[generator.nextInt(6)+5];
    
    for(int index=0; index<myArray.length; index++){
      myArray[index]=generator.nextInt(5);
    }
    
    return myArray ;
  }
  
  
  
}