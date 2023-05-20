 class parent
{

public static int a =10;

public static void m1()
{
System.out.println("parent class method");

}
}
 class child1 extends parent
{

public static int a = 50;

public static void m1()
{
System.out.println("child class method");
}

public static void main(String args[])
{

//parent p = new child();
//p.m1();
//child.m1();
System.out.println("variable value is"+child1.a);

}
}