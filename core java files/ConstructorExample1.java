class ConstructorExample1
{
int a;

//sir why this declaration though we have in constructor data type given

ConstructorExample1(int a)
{
this.a = a;


System.out.println("I am constructor"+a);
}

public void m1()
{

System.out.println("I am method1");
}


public static void main(String args[])
{



ConstructorExample1 ce1 = new ConstructorExample1(10);
ce1.m1();

}
}