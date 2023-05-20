interface  Test 
{

public abstract void m1();
public abstract void m2();
public abstract void m3();
}

abstract class  Test1 implements  Test
{

public void m1()
{

System.out.println(" I am from m1 method");
}
}


class Test2 extends Test1 
{
public void m2()
{

System .out.println(" I am from m3 method");

} 

public static void main(String args[])
{
//Test1 t = new Test1();


Test1 t1 = new Test2();
//Test2 t2 = new Test2();

t1.m1();
t1.m2();

}
}