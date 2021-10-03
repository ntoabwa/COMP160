
import java.text.DecimalFormat;
/* Application class for Triangle*/

public class TriangleApp{
  
  public static void main (String [] args){
    Triangle a = new Triangle(1,9,3,4,0,3, "A");
    Triangle b = new Triangle(6,7,9,4,4,2, "B");
    Triangle c = new Triangle(2,8,4,7,7,10, "C");
    
    DecimalFormat fmt = new DecimalFormat ("0.##");
    
    System.out.println("Triangle " + a.getName() + " perimeter is " + fmt.format(a.getPerimeter()) +" units");
    System.out.println("Triangle " + b.getName() + " perimeter is " + fmt.format(b.getPerimeter()) +" units");
    System.out.println("Triangle " + c.getName() + " perimeter is " + fmt.format(c.getPerimeter()) +" units");
  }
}
    
    
    
    
    
    
    
    