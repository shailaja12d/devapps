class FinalMethodOverriding
{

public final void method1()
{
System.out.println("I am from parent class");
}
}



class ChildClassOverriding extends FinalMethodOverriding
{

public  void method1()
{
System.out.println("I am from child class");
}

public static void main(String args[])
{
ChildClassOverriding ch = new ChildClassOverriding();
ch.method1();

}
}