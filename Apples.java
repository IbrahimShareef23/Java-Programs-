import java.util.*;
class Fruits
{
void eatFruits()
{
System.out.println("I am Apple a fruit");
}
}
class Apples extends Fruits
{
public static void main(String[] arg)
{
Apples a=new Apples();
a.eatFruits();
System.out.println("delicious apples");
}
}

