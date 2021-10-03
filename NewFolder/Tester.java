public class Tester{
  
  public static int[] dunedinTemps= {15, 12,9,13, 14};
  public static int[] aucklandTemps= {17, 15, 18, 14, 17};
  public static int[][] temps = {dunedinTemps, aucklandTemps};
  
  public static void main(String[] args){
   show(1,2);
   show(1,1);
    
  }
  
  public static void show(int row, int col){
     System.out.println(temps[row] [col]);
  }
  
}
  