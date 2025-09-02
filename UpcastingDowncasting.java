
class a
{
    public void show1()
    {
        System.out.println("in a show");
    }
}
class b extends a
{
    public void show2()
    {
        System.out.println("in show b");
    }
}

public class  UpcastingDowncasting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//
//    	System.out.println(i);

//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();

        a obj=new b();
        obj.show1();

        b obj1=(b)obj;
        obj1.show2();
    }
}