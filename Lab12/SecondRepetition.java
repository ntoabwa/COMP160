import java.util.Scanner;
/**Comp160...Lab12
  * 
  *Class SecondRepetition
  */

public class SecondRepetition{
  
  /**main method which counts the number of vowels and consonants in the input String and then print out their values.*/
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println("Enter a sentence");
    
    String mySentence = scan.nextLine();
    
    int index = 0;
    int vowcount = 0;
    int concount = 0;
    
    mySentence = mySentence.toLowerCase();
    
    
    while(index < mySentence.length() ){
      char ch = mySentence.charAt(index);
      if('a'<=ch && ch<='z'){
      switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          vowcount++;
          break;
          
        default:

          concount++;
      }
      }
      index++;
    }
    System.out.println("VowelCount : " + vowcount);
    System.out.println("ConsonantCount : " + concount);
    
  } 
}