class  DemoClassEqualMethod
{

int a =20;
String s = "shailaja";

public static void main(String args[])
{
DemoClassEqualMethod de = new DemoClassEqualMethod();

DemoClassEqualMethod1 de1 = new DemoClassEqualMethod1();

if(de.equals(de1))
{

System.out.println("objects are same");
}else
System.out.println("objects are not same");
}
}

class  DemoClassEqualMethod1
{

int a =20;
String s = "shailaja";
}