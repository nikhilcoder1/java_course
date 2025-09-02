// Exceptions are run-time errors

public class Exception_basic_code
{
    public static void main(String[] args)
    {

        int i=0;
        int j=0;

        try
        {
            j=18/i;
        }
        catch(Exception e) // "e" is an object of Exception class
        {
             System.out.println("Something went wrong"+ e); // this will print the error as well
            System.out.println("Something went wrong");
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
