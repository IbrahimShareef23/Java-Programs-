import java.util.*;
class ExampleDef
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the name of the customer:");
char n=s.nextChar();
System.out.println("the name is:"+n);
System.out.println(n.length());
System.out.println("enter the Phone no:");
int p = s.nextInt();
String i = Integer.toString(p);
System.out.println(i.length());


}
}