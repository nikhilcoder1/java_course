@Deprecated
class k
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }
}

class l extends k
{
    @Override
//	public void showTheDataWhichBelongToThisClass()
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show B");
    }
}

public class Annotations
{
    public static void main(String[] args)
    {
        l obj=new l();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
