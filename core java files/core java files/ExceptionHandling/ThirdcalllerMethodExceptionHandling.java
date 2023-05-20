
import java.io.*;

class ThirdcalllerMethodExceptionHandling extends Exception
{

public static void firstMethod()throws Gotomainmethodforhandling
{
   secondMethod();
}

public static void secondMethod() throws Gotomainmethodforhandling
{

 throw  new Gotomainmethodforhandling(" I am throwing Exception");
}

public static void main(String args[])throws Exception
{

firstMethod();

}
}