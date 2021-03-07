import java.util.*;
class ExampleIf
{
public static void main(String[] arg)
{
System.out.println("enter a number to check even or odd:");
Scanner s =new Scanner(System.in);
int x=s.nextInt();
if(x%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}
}
