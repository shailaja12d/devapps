
import java.io.*;

class MultipleCatchBlocks
{

public static void main(String args[])
{
int i =10;

try
{
int z =i/0;
}

catch(ArithmeticException e)
{
System.out.println("I can handle Arithemetic Exception");
}
/*catch(IOException e)
{
System.out.println("I can handle IOException Exception");
}
catch(InterruptedException e)
{
System.out.println("I can handle InterruptedException Exception");
}*/

}
}
