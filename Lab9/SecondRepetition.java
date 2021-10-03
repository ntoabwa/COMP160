import java.util.Scanner;
/**Comp160...Lab12
  * 
  *Class SecondRepetition
  */

public class SecondRepetition{
  
  public static void main(String[] args);
  
  Scanner scan = new Scanner(System.in);
  String mySentence = scan.nextLine();
  
  System.out.println("Enter a sentence");
  
  int index = 0;
  int vowcount = 0;
  int concount = 0;
  
  System.out.println(
    
  while(index < mySentence.length() ){
    char ch = mySentence.charAt(index);
  
  switch(ch){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    vowcount++;
    break;
    
    