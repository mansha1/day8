import java.util.Scanner;
public class Convert
{  
public static void main(String args[])
{   
String s="200";
int a;  
int i=Integer.parseInt(s);
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(i>a)
{
System.out.println(i);
}
else
{
System.out.println(a);
}
}
}  