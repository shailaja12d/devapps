class VerifyGovtBenfitsHelperClass 
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
}