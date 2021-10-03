/** Ngaaia Toabwa, 14/08/2017
  * 
  * COMP160
  * 
  * Lab 10 Leap Year Class
  */

public class Year{
  
  //Main method which calls the leapYear method to pass it the year values.
  public static void main (String [] args){
    leapYear(2014);
    leapYear(2016);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
    
  } 
  
  //method which process the year and display the output.
  public static void leapYear(int year){
    
    if (year<=1582){
      System.out.println(year + ": predates the Gregorian calendar");
      
      
    }else{
      if( (year%4==0) && (year%100!=0) && (year%400!=0) ){
        System.out.println(year + ": is a leap year");
      }else {
        if ( (year%4==0) && (year%100==0) && (year%400==0) ){
          System.out.println(year + ": is a leap year");
        
        }else{
          System.out.println(year + ": is not a leap year");
        }
      }
      
      
      
      
    }      
    
  }
}





