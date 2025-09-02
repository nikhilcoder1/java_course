import java.lang.String;

public class Hello
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int sum  = num1 + num2 ;
        float num3 = 8.3F; // it is not default therefore explicitly defining 'F'
        double num4 = 89.33 ; // it is default when using decimals
        byte b = 17; // also short , long : use 'L' at the end
        char ch = 's';
        String str = "hello";
        boolean bool = true;
        System.out.println("" + sum);
        System.out.println("Hello World!");

        // Literals
        int bin = 0b101;
        int hex = 0x7E;
        System.out.println(bin);
        System.out.println(hex);

        double exp = 12e10; //exponent
        System.out.println(exp);

        // Type Conversion and Type Casting(Explicit conversion)
        byte a;
        int a1 = 257;
        System.out.println((byte)a1); // Here , 257 % 256 = 1 , 256 is the size of byte.

        // Type Promotion
        byte  b1=10 , b2=30;
        int result = b1*b2 ; // As result was out of range for byte so promoted to int
        System.out.println(result);

        // Assignment Operators : + , - , * , / , % , ++ , -- , postfix , prefix

        // Relational Operators : < , > , == , <= , >= , !=

        // Logical Operators : && , || , !
    }
}
