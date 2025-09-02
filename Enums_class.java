enum Laptops
{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptops()
    {
        price=500;
    }

    private Laptops(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
        System.out.println("in Laptop" + this.name());
    }
}

public class Enums_class {
    public static void main(String[] args) {

//    	Laptop lap=Laptop.Mackbook;
//    	System.out.println(lap+ " : "+lap.getPrice());

        for(Laptops lap : Laptops.values())
        {
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}