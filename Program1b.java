/*Java program to implement the Stack using arrays. Write push(), pop(), and display() methods
to demonstrate its working.*/

import java.util.Scanner;
public class Program1b {
static int[] integerStack;
static int top = -1;
public static void main(String[] args) {
System.out.println("Enter stack size:");
Scanner scanner = new Scanner(System.in);
int size = scanner.nextInt();
integerStack = new int[size];
System.out.println("Stack operations:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.println("Enter your choice.");
int choice = scanner.nextInt();
while (choice != 4) {
if (choice == 1) {
System.out.println("Enter element to push:");
int element = scanner.nextInt();
if (top == size - 1)
System.out.println("stack is full"); else {
top = top + 1;
integerStack[top] = element;}
} else if (choice == 2) {
if (top == -1) {
System.out.println("stack is empty."); } else {
System.out.println("Popped element is :" + integerStack[top]);
top = top - 1; }
} else if (choice == 3) {
if (top == -1)
System.out.println("stack is empty");
else {
System.out.println("stack elementa are :");
for (int i = top; i >= 0; i--)
System.out.println(integerStack[i]);
}
} else
System.out.println("Enter correct choice.");
System.out.println("Stack operations:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.println("Enter your choice.");
choice = scanner.nextInt();}}
 }