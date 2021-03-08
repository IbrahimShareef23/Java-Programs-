import java.util.*;
class Warrior
{
public static void main(String[] arg)
{
System.out.println("enter a word to  be stored:");
Scanner s=new Scanner(System.in);
String x=s.nextLine();
if(x.length()!=2)
{
System.out.println("non empty string");
}
else if(x.length()>10)
{
System.out.println("the number of characters in the string are:"+x.length());
}
else if(x.length()<20)
{
System.out.println("the number of characters in the string are:"+x.length());
}
else
{
System.out.println("the string sucks");
}
}
}