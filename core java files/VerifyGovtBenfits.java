class VerifyGovtBenfits
{

public  static boolean checkTaxpayer(int salary)
{
boolean taxPayer = false;

if(salary>50000)
{

taxPayer = true;

} else {

taxPayer = false;

}

return taxPayer;

}

public static  void checkGovtBenfits(boolean taxpayer)

{
if(taxpayer == true)
{

System.out.println("he will get benefits");
} else {

System.out.println("he will not get benefits");

}
}

public static void main(String args[])
{

 boolean taxpayer =  VerifyGovtBenfits.checkTaxpayer(4000);

             VerifyGovtBenfits.checkGovtBenfits(taxpayer);


if(taxpayer == true)

{
System.out.println("he is taxpayer");
} else {

System.out.println("he is not taxpayer");

} 
}
}