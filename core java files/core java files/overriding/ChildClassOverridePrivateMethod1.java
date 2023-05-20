// 3 assignment

class OverridePrivateMethod1
{

private void method1()
{

System.out.println("I am from parent");

}
}

class ChildClassOverridePrivateMethod1 extends OverridePrivateMethod1
{

private void method1()
{

System.out.println("I am from child");

}
public static void main(String args[])
{

ChildClassOverridePrivateMethod1 ch = new ChildClassOverridePrivateMethod1();
ch.method1();

}
}