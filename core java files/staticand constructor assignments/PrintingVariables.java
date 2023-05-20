class PrintingVariables
{

int a =10;
static int b=100;

public static void main(String args[])
{

PrintingVariables pv = new PrintingVariables();

System.out.println("instance variable a is ="+pv.a);
System.out.println("instance variable a is ="+PrintingVariables.b);
System.out.println("static variable b is ="+pv.b);
System.out.println("static variable b is ="+b);

// it means we could print the static variables through the classname(PrintingVariables.b) ,direct variable(b), and through the instance variable also(pv.b).


}
}