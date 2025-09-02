// Interfaces are of three types : Normal , Functional(Single Abstract Method) , Marker
// Normal : more than 2 or more methods
// Functional : single method
// Marker : which has no methods(concept of serialization)

@FunctionalInterface
interface F
{
    void show();
    //	void run();
}

//  class B implements A
//  {
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Functional_Interface {
    public static void main(String[] args) {

        F obj=new F()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	A obj=new A();
        //   	A obj=new B();
        obj.show();
    }
}
