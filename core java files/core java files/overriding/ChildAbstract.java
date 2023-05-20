
//6)///compilation error
/*

ChildAbstract.java:16: error: ChildAbstract is not abstract and does not override abstract method method1() in ChildAbstract
class ChildAbstract
^
ChildAbstract.java:19: error: abstract methods cannot have a body
public abstract int method1()*/


class AbstractOverriden
{

public abstract int method1()
{
//System.out.println("I am from base class");

//return c;
}

}

class ChildAbstract extends AbstractOverriden
{

public abstract int method1()
{
//System.out.println("I am from ba class");
}

public static void main(String args[])
{
ChildAbstract cb = new ChildAbstract();
cb.method1();
}
}