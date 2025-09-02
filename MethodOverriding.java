
//class A
//{
//	public void show()
//	{
//		System.out.println("in A show");
//	}
//	public void config()
//	{
//		System.out.println("in A config");
//	}
//}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

class OverridingCalc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class OverridingAdvCalc extends OverridingCalc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}


public class MethodOverriding
{
    public static void main(String[] args)
    {
        OverridingAdvCalc obj=new OverridingAdvCalc();
        int r1=obj.add(3, 4);
        System.out.println(r1);
    }
}