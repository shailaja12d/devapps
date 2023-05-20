class Laptop
{

public int macBook()
{

int s = 0;

System.out.println(" I am too high in price");

return s;

}



public String macBook(String name)
{
return name;
}

public float macBook(float value, int a )
{

return value;
}

public int macBook(int price, String name, char c)
{

return price;
}


public static void main(String args[])
{

Laptop l = new Laptop();

int result = l.macBook();
String result1 = l.macBook("excellent");
float result2 = l.macBook(10000f,10);
int result3 = l.macBook(70000,"model",'s');


System.out.println(".  I am from MacBook "+result);
System.out.println(". performance wise I am excellent  "+result1);
System.out.println(". I will give good space  "+result2);
System.out.println(".  I am in too low in price  "+result3);


}
}

