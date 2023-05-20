class MethodResolution
{

public void m1()
{
System.out.println("I am from method1");
}

public void m1(int no)
{
System.out.println("I am from method2");
}
/*
public void m1(int no, String name)
{
System.out.println("I am from method3");
}
*/
public void m1(int no,String name,String course)
{
System.out.println("I am from method4");
}


public static void main(String args[])
{

MethodResolution mr = new MethodResolution();
/*if we don't have method in class and same if we call that method in main class object so it will compile time error as method resolution*(method call is there but method not defined with the corresponding parameters/

mr.m1();
mr.m1(10);
mr.m1(10,"shailaja");
mr.m1(10,"shailaja","course");

}
}
