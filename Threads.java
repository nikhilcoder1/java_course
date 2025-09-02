//Threads:-
//Multiple threads run at same time in a code.
//This is known as Multithreading.
//
//- A thread is a smallest unit to work with. (individual task)
//        - They can run parallelly.
//        - Multiple threads can share resources.

class t extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class h extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class Threads
{
    public static void main(String[] args) throws NumberFormatException {

        t obj1=new t();
        h obj2=new h();

//    	obj1.show();
//    	obj2.show();

        obj1.start();
        obj2.start();
    }

}