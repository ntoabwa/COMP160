/**Support class for Box which has three data fields*/

public class Box {
  
  /**sets the value of the data field numPages to input parameter value
    *@param n number of pages*/
  private int height, width, length;
  
  /**Contructor that take one parameter and set the three data values the same name
    * @set the data fields a name of c*/
  public Box (int c){
    height = c;
    width = c;
    length = c;
  }     
  
  /**constructor that takes three parameters and set the height, length and width data fields
    *@set the length, length and width*/   
  public Box (int h, int w, int l){
    height = h;
    width = w;
    length = l;
  }     
  /**default constructor which set the values of the data fields 0*/
  public Box(){}
  
  /**sets the value of the data field height to input parameter value
    *@param h value of height*/
  public void setHeight (int h){
    height = h;
  }
  
  /**sets the value of the data field width to input parameter value
    *@param w value of width*/
  public void setWidth (int w){
    width = w;
  }
  
  /**sets the value of the data field length to input parameter value
    *@param l value of length*/
  public void setLength (int l){
    length = l;
  }
  
  /**returns the value of the volume 
    *@return the volume of the box */
  public int getVolume(){
    return height*width*length;
  }
  
  /**returns the value of the surface area
    *@return the surface area of the box */
  public int getSurfaceArea(){
    return height*width*2 + length*height*2 + width*length*2;
  }
  
  /**method that will return a string describing the height, length, width, volume and surface area
    *@return the height, length, width, volume and surface area*/
  public String toString() {
    return "Height is: " + height + " Length is: " + length + " Width is: " + width + " Volume is: " +
      getVolume() + " Surface Area: " + getSurfaceArea();
    
  }
  
  
  
}


  