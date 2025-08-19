class Human {
    private int age ;
    private String name ;

    public Human(){     // default constructor
        age = 12;
        name = "John The Don";
    }

    public Human(int a , String n ){     // parameterized constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        Human obj1 = new Human();
        Human obj2 = new Human(25,"Nikhil");

        obj.setAge(30);
        obj.setName("Javascript");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}


// this keyword : refers to the current object who is calling the setAge()

// constructor : everytime a new object created , constructor is called