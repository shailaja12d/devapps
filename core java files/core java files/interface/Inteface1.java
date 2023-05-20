

interface  School
 
{
 public static final int a = 20;

public abstract void m1();

public abstract void m2();

public int m3(int a,String name,int marks);

}


class Inteface1 implements School
{

public void m1()
{

System.out.println("m1 method");
}


public void m2()
{

System.out.println("m2 method");
}

public int m3(int a,String name,int marks)
{

return 99;
}


public static void main(String args[])
{

Inteface1 ab = new Inteface1();

ab.m1();
ab.m2();
int c = ab.m3(10,"shailaja",99);

System.out.println(c);

System.out.println(" interface value is "+a);
System.out.println(" interface value is "+School.a);
System.out.println(" interface value is "+ab.a);


}

}

