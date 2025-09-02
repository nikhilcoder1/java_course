public class string
{
    public static void main(String[] args)
    {
        String name=new String("h");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello "+name);
        System.out.println(name.concat("reddy"));
        String name1="Navin";

        // ImMutable Strings : by default
        // Mutable Strings

        // StringBuffer

        StringBuffer sb = new StringBuffer("Nikhil");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));

        // StringBuffer is thread safe , while StringBuilder is not thread safe
    }
}
