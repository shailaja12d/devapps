import java.io.*;

public class PensionEligibleClass
{

//static int age =39;

public void ageLimit(int age)throws EligibleForPenstion
{

if(100>=age && age >30)
{
throw new EligibleForPenstion("eligible for pension");
}

else

{

System.out.println("he is not eligible for pension");

}

}
public static void main(String args[])throws EligibleForPenstion
{
int age =39;

PensionEligibleClass pe = new PensionEligibleClass();

pe.ageLimit(39);

}
}