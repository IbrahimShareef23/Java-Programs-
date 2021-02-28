import java.util.*;
class ArithExcep
{
  public static void main (String[] args)
  {
    try
    {
      int n1=25,n2=0;
      int n3=n1/n2;
      System.out.println("the division is:"+n3);
    }
    catch(ArithmeticException e)
    {
System.out.println("division by zero is not defined");
    }
  }
}
                     
