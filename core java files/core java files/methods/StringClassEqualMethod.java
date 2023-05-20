class StringClassEqualMethod
{

int a= 20;
String s= "Shailaja";



public String testString()
{

System.out.println("I am from testString method");

return "shailaja";
}

public static void main(String args[])
{

StringClassEqualMethod s1 = new StringClassEqualMethod();
StringClassEqualMethod s2 = new StringClassEqualMethod();

//String s2 = new String();
//String s1 = new String();

String result1 =s1.testString();
String result2 =s2.testString();



if(s1.equals(s2))
{
System.out.println("both are same");
}
else
{
System.out.println("both are not same");
}

}
}