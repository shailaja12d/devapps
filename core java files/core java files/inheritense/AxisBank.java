class AxisBank extends Bank,IciciBank 
{

public void fixedDeposit()
{
System.out.println("AxisBank fixed deposit here");

}

public static void main(String args[])
{

AxisBank ab = new AxisBank();

ab.fixedDeposit();
ab.accountRegistration();
ab.getLoan();
ab.chequeBook();
}



}