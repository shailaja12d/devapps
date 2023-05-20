class Test
{

public void method1()
{
System.out.println("I am parent method");
}
}



class Testpoly extends Test
{
public static void main(String args[])
{

Testpoly t1 = new Testpoly();
t1.method1();
}
public void method1()
{

System.out.println("I am child method");

}
}