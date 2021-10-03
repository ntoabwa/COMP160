import java.util.Scanner;
/**Ngaaia..COMP160
  * 
  * LAB 13
  * Creating an Anagram class
  */

public class SecondAnagram{
  public static void main(String[] args){
    myMethod();
    
    
    
  }
  public static void myMethod(String s){
    
    Scanner scan = new Scanner (System.in);         
    
    System.out.println("Enter first phrase");
    String phrase1 = scan.nextLine();
    
    phrase1 = phrase1.toLowerCase();
    
    String newString = "";
    
    for(char ch='a'; ch<='z'; ch++){
      for(int index=0; index<phrase1.length(); index++){
        if(phrase1.charAt(index)==ch)
          newString = newString + ch;
      }
      
      System.out.println();
    }
    
    
    
    
    
    System.out.println(newString + " are the letters of " + phrase1 + " in order");
    System.out.println(newString2 + " are the letters of " + phrase2 + " in order");
    System.out.println(phrase1 + " is an anagram of " + phrase2);
    
    
    
    
    
  }
}