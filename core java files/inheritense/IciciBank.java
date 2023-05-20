class IciciBank extends Bank
{

String BankName;


public void getBikeLoan()
{
System.out.println("your eligible for bike loan");

}


public static void main(String args[])
{


IciciBank ib = new IciciBank();

ib.chequeBook();
ib.accountRegistration();
ib.getBikeLoan();

}

}