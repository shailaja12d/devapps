public class Bank1
{

Customer cust = new Customer("Shailaja",30,"10-10-1988",'F',"123445");


public static void main(String args[])
{
Bank1 b = new Bank1();
b.payment();
}

public void payment()
{

AccountDetails acc = new AccountDetails();
AccountDetails details = acc.AccountDetails(cust);

}
}