import java.text.NumberFormat;          
import java.text.DecimalFormat;
import java.util.Scanner;
/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  public static void main(String[]args){
    
//each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1); 
    confirmBooking(customer2);
    confirmBooking(customer3); 
    confirmBooking(customer4);
    confirmBooking(customer5); 
    confirmBooking(customer6);
    confirmBooking(customer7); 
    confirmBooking(customer8);
    finalMethod(customer1);
    finalMethod(customer2);
    finalMethod(customer3);
    finalMethod(customer4);
    finalMethod(customer5);
    finalMethod(customer6);
    finalMethod(customer7);
    finalMethod(customer8);
    //and so on
    
  }
  
  //Method that display prices and confirm the booking
  public static void confirmBooking(Customer customer){
    
    
    double ticketPrice = 56.0;
    double mealPrice = 30.0;
    
    if(customer.isChild() || customer.isStudent()){
      ticketPrice = ticketPrice/2;
    } else {
      ticketPrice = ticketPrice - (0.2 * ticketPrice);
    }
    
    if(customer.isChild()) {
      mealPrice = mealPrice/2;
    } else {
      mealPrice = mealPrice - (0.1 * mealPrice);
    }
    
    
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    DecimalFormat fmt = new DecimalFormat ("0.00");
    System.out.println(customer.getName() + "\nTicket price:" + fmt1.format(ticketPrice) +"\nMeal price:" + fmt1.format(mealPrice)+ "\nTotal is:" +
                       fmt1.format(ticketPrice+mealPrice) + "\nConfirm booking for " + customer.getName() + " Y/N " );
    Scanner scan = new Scanner(System.in); 
    String confirm = scan.nextLine();
    
    
    
    
    if( confirm.equals("y") || confirm.equals("Y")){
      System.out.println("Booked");
      customer.setBooked();
    }
  }  
  
  // Method which only prints out booked customers
  public static void finalMethod(Customer customer){
    
    if(customer.isBooked()){
      System.out.println(customer.getName() + " is booked ");
    }
    
  }
  
}





