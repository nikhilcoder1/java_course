public class WrapperClass
{
    public static void main(String[] args)
    {
        int num1 = 7 ;
        Integer num = num1 ; // auto-boxing : when you store a primitive type in the object automatically

//        int num2 = num.intValue(); Unboxing : when you take out the primitive value from the object
//        int num2 = num; Auto - Unboxing
        System.out.println(num);

        String str = "12" ;
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
