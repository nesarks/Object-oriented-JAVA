//Create a Java class called Student with the following details as variables within it. (i) USN (ii) Name (iii)
Branch (iv) Phone no. Write a Java program to create n student objects and print the USN, Name, Branch,
and Phone no. of these objects with suitable headings

import java.util.Scanner;
public class student {
String USN;
String Name;
String branch;
String phone;
 void insertRecord(String reg, String name, String brnch, String ph) {
USN = reg;
Name = name;
branch = brnch;
phone = ph; }
 void displayRecord() {
System.out.println(USN + " " + Name + " " + branch + " " + phone); }
 public static void main(String args[]) {
student s[] = new student[100];
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of students");
int n = sc.nextInt();
for (int i = 0; i < n; i++)
s[i] = new student();
for (int j = 0; j < n; j++) {
System.out.println("enter the usn,name,branch,phone");
String USN = sc.next();
String Name = sc.next();
String branch = sc.next();
String phone = sc.next();
s[j].insertRecord(USN, Name, branch, phone); }
for (int m = 0; m < n; m++) {
s[m].displayRecord();
}}}