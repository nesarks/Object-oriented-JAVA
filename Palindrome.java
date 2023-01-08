//Program to find the input number is palindrome or not

import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter a number");
intnum=s.nextInt();
int num1=num;
int rev=0;
while(num1>0)
{
int digit=num1%10;
rev=rev*10+digit;
num1=num1/10;
}
if(rev==num)
System.out.println("The entered number "+num+ " is a palindrome");
else
System.out.println("The entered number "+num+ " is not a palindrome");
}
}