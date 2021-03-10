import java.util.*;
class WeekDays
{
public static void main(String[] arg)
{
System.out.println("enter the day of the week:");
Scanner s=new Scanner(System.in);
int day=s.nextInt();
switch(day)
{
case 1:System.out.println("Monday");
break;
case 2:System.out.println("Tuesday");
break;
case 3:System.out.println("Wednesday");
break;
case 4:System.out.println("Thursday");
break;
case 5:System.out.println("Friday");
break;
case 6:System.out.println("Saturday");
break;
case 7:System.out.println("Sunday");
break;
default:System.out.println("no such day found");
break;
}
}
}