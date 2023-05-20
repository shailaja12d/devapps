


class AccessSpecifierOverriden
{
private  void method1()
{
System.out.println("I am parent method");
}

}


class childAccessSpecifierOverriden
{

private void method1()
{
System.out.println("I am child method");
}

public static void main(String args[])
{

childAccessSpecifierOverriden ch = new childAccessSpecifierOverriden();

AccessSpecifierOverriden av = new AccessSpecifierOverriden();
//av.method1();

ch.method1();
}

}