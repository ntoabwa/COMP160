/**  
 * Customer.java
 * 
 * Lab 9, COMP160  2017
 * 
 * Stores and displays information about a customer.
 */

public class Customer{
  //data fields declarations
  private String name;              // customer name
  private boolean child;            // customer is a child or not
  private boolean student;          // customer is a student or not
  private boolean booked;           // customer has booked or not
  
  /**constructor that takes three parameters and set the name, child and student data fields
    *@set the name, child and student*/ 
  public Customer (String nameIn, int age, boolean studentIn){
    name = nameIn;
    child = age>5 && age <= 16;
    student = studentIn;
  }
  
 /**returns the value of the data field name 
   *@return the name of the customer*/
  public String getName(){
    return name;
  }
  
 /**returns the value of the data field child 
   *@return whether the customer is a child*/
  public boolean isChild(){
    return child;
  }

 /**returns the value of the data field student 
   *@return whether the customer is a student*/
  public boolean isStudent(){
   return student;
  }
  
  /**returns the value of the data field booked
   *@return whether the customer has booked*/ 
  public boolean isBooked(){
    return booked;
  }
  
  /**sets the value of the data field booked to input parameter value
   *@param bookIn the booked*/
  public void setBooked(){
     booked = true;
  }
    
}
    
    
   
       
      
      
      
      
      
      
      