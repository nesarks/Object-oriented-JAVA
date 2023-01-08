//Program to print first 10 numbers in Fibonacci series.

public class Fibo
{
public static void main(String args[])
{
inta,b,temp,n;
a=0;
b=1;
for(n=1;n<=10;n++)
{
System.out.println(a);
temp=a+b;
a=b;
b=temp;
}
}
}