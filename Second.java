import java.util.Scanner;
public class Second
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Conditional statements : If-else , if-else-if

        // Ternary Operator
        int n ;
        int result = 0 ;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        result = (n<10) ? ((n%2==0)? 10:40 ):((n%2!=0)?20:30) ; // Multiple conditions
        System.out.println(result);

        // Switch statement

        // Loops : for , while and do-while
        
    }
}
