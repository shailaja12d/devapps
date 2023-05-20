interface MethodHiding
{

public static int  a = 20;

public  abstract  void m1();
//public static abstract void m1();

// why are  opposite to the abstract and static


}





class StaticInteface implements MethodHiding
{

public void m1()
{

System.out.println("I am from m1");
}

public void m2()
{

System.out.println("I am from m2");
}


public static void main(String args[])
{

StaticInteface is  = new StaticInteface();

//is.m1()

//StaticInteface.m1();

is.m1();
is.m2();

}
}