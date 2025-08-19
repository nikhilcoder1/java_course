class C{
     public C(){
          System.out.println("object created");
     }

     public void show(){
          System.out.println("Anonymous object! in A show");
     }
}

public class anonymousObject
{
     public static void main(String[] args)
     {
          new C().show(); // anonymous object
     }
}
