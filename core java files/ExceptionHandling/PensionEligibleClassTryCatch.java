import java.io.*;

public class PensionEligibleClassTryCatch
{

//static int age =39;

public void ageLimit(int age)throws Exception
{

if(100>=age && age >50)
{


System.out.println("I am eligible for pension");
}
else

{

System.out.println("he is not eligible for pension");

}

}
public static void main(String args[])throws Exception
{
int age =20;

PensionEligibleClassTryCatch pe = new PensionEligibleClassTryCatch();

pe.ageLimit(23);

}
}