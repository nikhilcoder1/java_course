// interface is different from abstract class as firstly it is not a class
// also, they are all by default "public abstract"
// Interface does not perform , it just shows you the direction
// All variables in interface are by default final and static
// We don't instantiate an interface , we instantiate a class
// Interface don't have their own memory so there variables are final

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface I {
    int age = 0;    // implicitly public static final
    String area = "Lucknow"; // implicitly public static final

    void show();    // implicitly public abstract
    void config();  // implicitly public abstract
}

interface X{
    void run();
}

interface Y extends X{

}

class J implements I,Y {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run(){
        System.out.println("running...");
    }
}

public class interface_code {
    public static void main(String[] args) {
        I obj = new J();

        obj.show();
        obj.config();

        // I.area = "Hyderabad"; // ❌ Not allowed: area is final
        System.out.println(I.area);

        Y obj1 = new J();
        obj1.run();
    }
}