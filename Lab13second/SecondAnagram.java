import java.util.Scanner;
/** COMP160
  * LAB 13
  * Creating an Anagram class
  */


public class SecondAnagram{
  
  /**main method which check if the two strings are an anagram of each other 
   * and prints out the result*/
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in); 
    System.out.println("Enter first phrase");
    String phrase = scan.nextLine();
    System.out.println("Enter second phrase");
    String phrase2 = scan.nextLine();
    
    String sorted1 = myMethod(phrase);
    String sorted2 = myMethod(phrase2);
    
    System.out.println(myMethod(phrase) + " are the letters of " + phrase + " in order");
    System.out.println(myMethod(phrase2) + " are the letters of " + phrase2 + " in order");
    
    if(myMethod(phrase).equals(myMethod(phrase2)) ){
      System.out.println(phrase + " is an anagram of " + phrase2);
    }else{
      System.out.println(phrase + " is not an anagram of " + phrase2);
    } 
    
    
  }
  
  /**method which rearrange string letters in aphabetical order in a new string and returns the value to the main */
  public static String myMethod(String s){
    
    s=s.toLowerCase();
    
    String newString = "";
    
    for(char ch='a'; ch<='z'; ch++){
      for(int index=0; index<s.length(); index++){
        if(s.charAt(index)==ch){
          newString = newString + ch;
        }
      }
      
      
    }
    
    return newString;
    
    
    
    
  }
}