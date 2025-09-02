@FunctionalInterface
interface y
{
    int add(int i, int j);
}


public class Lamda_expression_return {
    public static void main(String[] args) {
//
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};

        y obj=(i,j) -> i+j;

        int result=obj.add(5, 4);
        System.out.println(result);
    }
}
