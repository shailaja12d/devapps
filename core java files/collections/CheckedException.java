import java.io.*;


class CheckedException
{

public static void main(String args[])throws Exception
{
try
{

InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);

String name = br.readLine();
}

catch(Exception e);
{
System.out.println("the output name");
}


}
}