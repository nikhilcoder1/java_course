class D
    {
        int age;

        public void show()
        {
            System.out.println("in show");
        }

//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}

        static class E
        {
            public void config()
            {
                System.out.println("in config");
            }
        }
    }


public class InnerClass{
        public static void main(String[] args) {
            D obj=new D();
            obj.show();

//    	A.B obj1=obj.new B(); This will work when inner-class is non-static
//    	obj1.config();

            D.E obj1=new D.E(); // This will work when inner-class is static
            obj1.config();

        }
    }
// Anonymous InnerClass

// Abstract + Anonymous InnerClass