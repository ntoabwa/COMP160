import java.util.Scanner;
/** 5/09/2017...COMP160
  * Lab 12
  * Class Repetition
  */

public class Repetition{
  
  /**Main method which make sure that the input value is greater than or equal 2 and then
    *prints out the sum of even numbers between 2 and the input value.*/
  public static void main (String[] args){
    
    int count = 2;
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter an integer greater than 1");
    
    int input = scan.nextInt();
    
    if(input>=2){
      while(count<=input){
       // if(count%2==0) 
          sum+=count;
        count+=2;
      } 
      System.out.println("Sum of even numbers between 2 and 7 inclusive is: " + sum);
      
    }else{
      System.out.println("Input value must not be less than 2");
    }
    
    
  }
}





