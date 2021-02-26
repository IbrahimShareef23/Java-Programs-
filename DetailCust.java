import java.util.*;

class DetailCust
{
public static void main(String args[])
{
System.out.println("enter the name of the customer:");
Scanner s=new Scanner(System.in);
String name=s.nextLine();
System.out.println("enter the Phone no:");
int p=s.nextInt();
String i=Integer.toString(p);
if(i.length()==10)
{
System.out.println("the phone no is :"+p);
}
else
{
System.out.println("please enter a valid no:");
}
System.out.println("the details of the customer are:");
System.out.println("customers Name:"+name);
System.out.println("phone no:"+p);
}
}

