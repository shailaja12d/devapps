class parent
{

int a =10;

public static void m1()
{
System.out.println("parent class method");

}
}


public class child extends parent
{

int a = 50;

public static void m1()
{
System.out.println("child class method");
}

public static void main(String args[])
{
parent p = new child();
p.m1();                                                         
System.out.println("variable value is"+p.a);

}
}

