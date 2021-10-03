import java.util.Scanner;
/**COMP160..Lab16
  * 
  * Two Dimentional Arrays.
  */

public class Array{
 
  /**Method which create and manipulate an array of String objects from the user, and then prints out the 
    * result of the user's guess*/
  public static void main(String[] args){
    String [] fruits = new String[3];
    
    Scanner scan = new Scanner(System.in);
    
    for(int i = 0; i<3; i++){
      System.out.println("Enter a fruit");
      fruits[i] = scan.nextLine(); 
    }
    for(String eachFruit: fruits){
      boolean correct = false;
      while(!correct){
        System.out.println("Guess what fruit I am "+ eachFruit.substring(0,2) + "  "+ eachFruit.length() + " letters");
        String guess=scan.nextLine();
      if(eachFruit.equals(guess) ){
        System.out.println("Correct");
        correct = true;
      }else{
        System.out.println("Try again");
      }
      }
       
      
      
      
      
    }
    
  }
}