//4)

class ReturnTypeOverriding
{

public String method1()
{
System.out.println("Hello I am returning from super class");

return "shailaja";
}



}

class ChildClassReturnType extends ReturnTypeOverriding
{

public String method1(int a)
{
System.out.println("Hello I am returning from  child class");

return "rohan";

}

public static  void main(String args[])
{

ChildClassReturnType ch = new ChildClassReturnType();

String s = ch.method1();

String s1 = ch.method1(10);

}

}