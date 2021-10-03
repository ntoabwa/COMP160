/**Comp160..lab16
  * 
  * Creating a multiplication table
  */

public class MultiplicationTable{
  
  /**Making a multiplication table and then fills it with data..*/ 
  public static void main(String [] args){
    int cols = 12;
    int rows = 12;
    
    int [] [] table = new int [rows] [cols];
    for (int row=0; row < rows; row++){
      for(int col=0; col<cols; col++){
        table [row][col] = (row+1) * (col+1);
      }
      
    }
    
    for(int[] eachRow: table){
      for(int eachValue: eachRow){
        System.out.print(eachValue + "\t");
      }
      System.out.println();
      
    }
    
    
  }
  
  
}