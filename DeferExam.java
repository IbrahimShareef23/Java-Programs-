import java.util.*;
class DeferExam
{
public static void main(String args[])
{
System.out.println("enter the a decimal number:");
Scanner s=new Scanner(System.in);
float f=s.nextFloat();
System.out.println("the number entered is :"+f);
String z=Float.toString(f);
System.out.println(z.length());
}
}
