import java.util.Scanner; 
public class CharDemo
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
System.out.println("enter a word to print:");
        char c = sc.next().charAt(3); 
        System.out.println("c = "+c); 
    } 
}