/* Application class called BoxApp */

public class BoxApp{
  
  public static void main (String[] args){
    Box box1 = new Box();
    box1.setHeight(4);
    box1.setWidth(6);
    box1.setLength(4);
    
    Box box2 = new Box(3, 4, 5);
    System.out.println(box1);
    System.out.println(box2);
    
    
    Box box3 = new Box(5);
    System.out.println(box3);
    
    
    
    
  }
}
    
  
                            
                                   