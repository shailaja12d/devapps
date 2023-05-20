class MethodHidingParent
{
static int a= 10;

public static void method1()
{
System.out.println("I am from parent");

}
}
class MethodHidingchild extends MethodHidingParent
{

static int a =20;

 public static void method1()
{
System.out.println(" I am from from child");

}

public static void main(String args[])
{

//MethodHidingParent mh = new MethodHidingchild();

MethodHidingchild mh = new MethodHidingchild();

 mh.method1();

//System.out.println("a value is"+mh.a);//sir why its displaying  parent value through we did not mention as static and non static
}
}

