package staticexample;

class Parent
{
    void input()
    {
        System.out.println("In parent normal method");
    }
    static void output()
    {
        System.out.println("In parent static method");
    }
    
}
class Child extends Parent
{
    void input()
    {
        System.out.println("In Child normal method");
    }
    static void output()
    {
        System.out.println("In Child static method");
    }
    void input1()
    {
        System.out.println("In child 1 normal method");
    }
}


public class StaticExample 
{
    public static void main(String[] args) 
    {
        Child cd=new Child();
        cd.input();
        cd.output();
        Parent pn=new Child();
        pn.input();
        pn.output();
        //pn.input1(); error
        Parent un=new Parent();
        un.input();
        un.output();
        
    }
    
}
