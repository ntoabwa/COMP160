/*Class for Triangle*/

public class Triangle  {
  
  private int p1x, p1y, p2x, p2y, p3x, p3y;
  private String name;
  
  public Triangle (int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    
  p1x = pt1x;
  p1y = pt1y;
  p2x = pt2x;
  p2y = pt2y;
  p3x = pt3x;
  p3y = pt3y;
  name = nameIn;
  }
  
  
  
  public double getSide(int x1, int y1, int x2, int y2){
    return Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
  }
  
  public double getPerimeter(){
    return getSide(p1x,p1y,p2x,p2y) + getSide(p2x,p2y,p3x,p3y) + getSide(p1x,p1y,p3x,p3y);
  }
  
  
  public String getName(){
    return name;
  }
}
  
  