//Inheritance:-
//
//is, has
//"is" is used in inheritance

//Class Calc  --> Parent class , Super, Base
//{
//add()
//sub()
//multi()
//div()
//}
//
//Class AdvCalc --> Child class, Sub, Derived
//{
//        {
//        }
//        }

class Calc
{
    public int add(int n1,int n2){
        return n1+n2 ;
    }

    public int sub(int n1,int n2){
        return n1-n2 ;
    }
}

// Single-Level Inheritance

// AdvanceCalc : subclass , derived
// Calc : superclass , parent-class

class AdvanceCalc extends Calc{
    public int mul(int n1,int n2){
        return n1*n2 ;
    }

    public int div(int n1,int n2){
        return n1/n2 ;
    }
}

// Multi-Level Inheritance

class VeryAdvanceCalc extends AdvanceCalc
{
    public double pow(int n1,int n2)
    {
        return Math.pow(n1,n2);
    }
}

public class Inheritance_intro
{
    public static void main(String[] args)
    {
        VeryAdvanceCalc obj = new VeryAdvanceCalc();
        int r1 = obj.add(2,4);
        int r2 = obj.sub(2,4);
        int r3= obj.mul(2,4);
        int r4 = obj.div(13,3);
        double r5 = obj.pow(2,4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

// Multiple inheritance does not supported by Java
// Ambiguity issue