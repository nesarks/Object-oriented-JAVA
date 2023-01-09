//Define an interface using JAVA that contains a method to calculate the perimeterof anobject.Define two classes-circle and Rectangle with suitable fields and methods. Implement theinterface
27“perimeter” in these classes. Write the appropriate main() method to create object of eachclassandtest all the methods

importjava.util.Scanner;
interface perimeter
{
public void compPerimeter();
}
class Circle implements perimeter
{
public void compPerimeter()
{
System.out.println("Enter the radius of the circle");
Scanner s=new Scanner(System.in);
float r=s.nextFloat();
doubleCircleperimeter=2*3.14*r;
System.out.println("Perimeter of the circle is "+Circleperimeter);
}
}
class Rectangle implements perimeter
{
public void compPerimeter()
{
System.out.println("Enter the Length and Bredth of the recatngle");
Scanner s=new Scanner(System.in);
float l=s.nextFloat();
float w=s.nextFloat();
doubleRectperimeter=2*(l+w);
System.out.println("Perimeter of the Rectangle is "+Rectperimeter);
}
}
classInterfacedemo
{
public static void main(String args[])
{
Circle ob1=new Circle();
ob1.compPerimeter();
Rectangle ob2=new Rectangle();
ob2.compPerimeter();
}
}