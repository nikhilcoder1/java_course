// Every class in Java extends the Object class

/**
 // super()
 class A
 {
 public A()
 {
 super();
 System.out.println("in A");
 }
 public A(int n)
 {
 super();
 System.out.println("in A int");
 }
 }
 class B extends A
 {
 public B()
 {
 //		super();
 super(5);
 System.out.println("in B");
 }
 public B(int n)
 {
 //		super();   //call default constructor of super class
 super(n);
 System.out.println("in B int");
 }
 }
 public class Demo {
 public static void main(String[] args)
 {

 B obj=new B();
 //		B obj=new B(5);
 }
 }
 **/


//this() 
class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();  //call constructor of same class
        System.out.println("in B int");
    }
}
public class this_super_method {
    public static void main(String[] args)
    {

//		B obj=new B();
//        Z obj=new Z(5);
    }
}

// Naming Convention : Camel Casing

// class and interface : Calc , Runnable
// variable , function/method : marks , marks()
// constants : PIE, BRAND
// constructor : Human()
// showMyMarks()
// MyData