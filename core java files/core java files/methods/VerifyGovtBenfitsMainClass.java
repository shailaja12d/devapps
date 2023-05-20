import java.io.*;

class VerifyGovtBenfitsMainClass
{


public static void main(String args[]) throws IOException
{

//int salary = 60000 ;


InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("please enter salary");
String salary=br.readLine();

int esalary =   Integer.parseInt(salary);

 boolean taxpayer = VerifyGovtBenfitsHelperClass.checkTaxpayer(esalary);


            VerifyGovtBenfitsHelperClass.checkGovtBenfits(taxpayer);


if(taxpayer == true)

{
System.out.println("he is taxpayer");
} else {

System.out.println("he is not taxpayer");

} 
}
}