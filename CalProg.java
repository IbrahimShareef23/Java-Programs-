import java.util.*;
class CalProg
{
public static void main(String[] arg)
{
System.out.println("enter first numbers:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println("enter second numbers:");
int b=s.nextInt();
int c=a*b;
int d=a+b;
int e=a-b;
System.out.println("sum of numbers:"+d);
System.out.println("multiplication of numbers:"+c);
System.out.println("subtraction of numbers:"+e);
}
}
