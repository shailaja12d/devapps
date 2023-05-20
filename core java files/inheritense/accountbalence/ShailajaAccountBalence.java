class ShailajaAccountBalence
{

int currentbalance  = 20000;


public int payment(int transferamount )
{

int remainbalance = currentbalance-transferamount;

System.out.println("Remaining balance amount is in shailaja account" +remainbalance);

return transferamount;

}




}