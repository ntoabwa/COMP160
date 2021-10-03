/** 
 * CalcTextApp.java
 * 
 * Lab19, COMP160,  2016
 * 
 *  A simple text based application front end to Calculator
 */

public class CalcTextApp {  

 // create an instance of the Calculator class
 private static Calculator c = new Calculator();

 /** Main method - performs a simple calculation on the calculator */ 
 public static void main(String[] args) {
  // A simple calculation, 50 - 26 =  
  c.inDigit(4);
  c.inDigit(0);
  c.inOperator("*");
  c.inDigit(1);
  c.inDigit(0);
  c.inEquals();
  System.out.println( "40 * 10 = " + c.getResult()); 
  c.inClear();
 } 

}  

