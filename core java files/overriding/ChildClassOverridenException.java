// 5)

import java.io.*;
class OverrideException
{

public void method1() throws IOException
{
System.out.println("I am parent class method throwing IOException");
}

}


class ChildClassOverridenException extends OverrideException
{

public void method1() throws Exception
{
System.out.println("I am child class method throwing Exception");
}

public static void main(String args[])
{
ChildClassOverridenException cc = new ChildClassOverridenException();
cc.method1();
}

}