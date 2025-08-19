class NavinException extends Exception
{
    public NavinException(String string)
    {
        super(string);
    }
}

class d
{
    public void show() throws ClassNotFoundException
    {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}

public class Exception_throws {

    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        d obj=new d();
        try {
            obj.show();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace(); // tracks the messages , i.e. bcz of which method the problem appeared
        }
    }
}
