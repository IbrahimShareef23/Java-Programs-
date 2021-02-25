import java.util.*;
class InstanceVar
{
int count; // instance variable created
public static void main(String args[])
{
InstanceVar obj1=new InstanceVar();
InstanceVar obj2=new InstanceVar();
obj1.count=5;
obj2.count=5;
obj1.count++;
System.out.println(obj1.count);
System.out.println(obj2.count);
}
}
