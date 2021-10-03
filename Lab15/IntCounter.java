/** Comp 160..Lab15
  * 
  * Support class for arrays
  */
public class IntCounter{
  
  private int[]numArray;
  
  public IntCounter(int[] numArray){
    this.numArray = numArray;
    for(int eachInt: numArray){
      System.out.print(eachInt + " ");
    }
    System.out.println("Array is of length " + numArray.length);
  }
  
  public void showTarget(int target){
    for(int index=0; index<numArray.length; index++){
      if(numArray[index]==target){
        System.out.println("There is a "+ target + " at position " + index);
      }
    }
    
    
  }
  
  
}