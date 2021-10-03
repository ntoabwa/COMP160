/** Comp160...Lab16
  *Calculating the average of numbers in a row.
  * 
  */
public class Average{
  
  /**method that creates a table with values and then calculates 
    * the average of each row*/
    public static void main (String[] args){
    
    
    
    int [] [] table = { {1, 2, 3}, {4, 5, 6}, {7, 8} };
    double sum;
    
    double average;
    
    for(int[] eachRow: table){
    sum = 0.0;
    for(int eachValue: eachRow){
    
    System.out.print(eachValue + "  ");
    
    sum+=eachValue;
    
    
    }
    average = sum/eachRow.length;
    System.out.println("Average : " + average);
    
    }
    
    
    
    
    
    
    
    }
    
    
    }