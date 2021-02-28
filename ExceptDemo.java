import java.util.*;
class ExceptDemo.java
{
  public static void main(String[] args)
  {
    int x,y;
    try
    {
      x=0;
      y=20/x;
      System.out.println("not printed");
    }
    catch(ArithmeticException e)
    {
      System.out.println("division by zero"+e);
    }
    System.out.println("after catch");
  }
  }
  
