interface  interface1
{
 public static final int a = 10;

public abstract void m1();

}

class example1 implements interface1
{

public void m1()
{

System.out.println(" I am from interface");

}

public static void main(String args[])
{

example1 e = new example1();
e.m1();
System.out.println("interface variable value is"+interface1.a);
System.out.println("interface variable value is"+interface1.a);
}


}