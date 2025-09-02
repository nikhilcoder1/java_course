class MobilePhones
{
    String brand;
    int price;
    String network;
    static String name;

    static
    {
        name="Phone";
        System.out.println("in static block");
    }

    public MobilePhones()
    {
        brand="";
        price=200;
//		name="Phone";
        System.out.println("in constructor");
    }

    public void show()  // instance method , when you want to use an instance method , u need to create an object of that method
    {
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(MobilePhones obj)
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}

public class static_method
{
    public static void main(String[] args) throws ClassNotFoundException
    {

        Class.forName("MobilePhones"); // loads your class , however it throws an exception

		MobilePhones obj1=new MobilePhones();
		obj1.brand="Apple";
		obj1.price=1500;
		MobilePhones.name="SmartPhone";

        MobilePhones obj2=new MobilePhones();
		obj2.brand="Samsung";
		obj2.price=1700;
		Mobile.name="SmartPhone";

        MobilePhones.name = "Phone";

        obj1.show();
        obj2.show();

        MobilePhones.show1(obj1);
    }
}