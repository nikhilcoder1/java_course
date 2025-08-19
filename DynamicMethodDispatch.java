// class Computer
// {
//	
// }
// class Laptop extends Computer
// {
//	
// }

class Aa
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class Bb extends Aa
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class Cc extends Aa
{
    public void show()
    {
        System.out.println("in C show");
    }
}


public class DynamicMethodDispatch{
    public static void main(String[] args) {
//		A obj=new B();
//		obj.show();

        Aa obj=new Aa();
        obj.show();

        obj=new Bb();
        obj.show();

        obj=new Cc();
        obj.show();

//		obj=new D();

//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();

    }
}