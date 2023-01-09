//Programs for creating multiple threads a) Using Thread class

class FirstThread extends Thread
{
//This method will be executed when this thread is executed
public void run()
{
//Looping from 1 to 10 to display numbers from 1 to 10
for (inti=1; i<=10; i++)
{
//Displaying the numbers from this thread
System.out.println( "Message from First Thread : " +i);
try
{
Thread.sleep(1000);
}
catch (InterruptedExceptioninterruptedException)
{
System.out.println( "First Thread is interrupted when it is sleeping" +interruptedException);
}
}
}
}
class SecondThread extends Thread
{
//This method will be executed when this thread is executed
public void run()
{
//Looping from 1 to 10 to display numbers from 1 to 10
for (int i=1; i<=10; i++)
{
System.out.println( "Message from Second Thread : " +i);
try
{
Thread.sleep (1000);
}
catch (InterruptedException interruptedException)
{
System.out.println( "Second Thread is interrupted when it is sleeping" +interruptedException);}
}
}
}
public class ThreadDemo1
{
37public static void main(String args[])
{
//Creating an object of the first thread
FirstThread firstThread = new FirstThread();
//Creating an object of the Second thread
SecondThread secondThread = new SecondThread();
//Starting the first thread
firstThread.start();
//Starting the second thread
secondThread.start();
}
}