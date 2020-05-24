import java.util.Scanner;
//import java.lang.StringBuffer;

class reverse_without_string
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the string to reverse : ");
String str = sc.nextLine();
System.out.print("Reverse is :");
char c[] = str.toCharArray();
for(int i = c.length-1;i>=0;i--)
{
System.out.print(c[i]);
}
}
}