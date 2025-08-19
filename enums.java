// Status is a class , and inside them are the objects(named constants)

enum Status
{
    Running, Failed, Pending, Success;
}

public class enums
{
    public static void main(String[] args)
    {
        int i=5;
    	Status s= Status.Running;
    	Status s1= Status.Failed;
    	Status s2= Status.Success;

    	System.out.println(s);
    	System.out.println(s1.ordinal());

        Status[] ss=Status.values();
        System.out.println(ss);

        for(Status all:ss)
        {
            System.out.println(all);
            System.out.println(all+" : "+all.ordinal());
        }
    }
}

