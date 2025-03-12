

import java.util.Scanner;
class multiplication
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the multiplication number:");
int n = obj.nextInt();
for (int i = 1 ; i <= 10 ; i++);
{
System.out.println(i , "x" , n , "=" , (n*i));
}
obj.close();
}
}
