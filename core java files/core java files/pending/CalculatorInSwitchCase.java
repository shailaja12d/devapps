import java.util.*;

class CalculatorInSwitchCase

{

public static void main(String args[])
{

int x=10;

int y=20;

int Z;

System.out.println("enter the operation");

Scanner sn = new Scanner(System.in);

int p = Integer.parseInt(sn.nextLine());

Switch(p)

{

Case:p == '+'

   p= x+y;

System.out.println(p);

break;