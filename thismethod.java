/*   Hello Student   */
import java.util.*;
public class thismethod{
  void display()
  {
    System.out.println("Hello Student");
  }
  void display1()
  {
    this.display1();
  }
  public static void main(String args[]){
    thismethod o=new thismethod();
    o.display();
  }
}