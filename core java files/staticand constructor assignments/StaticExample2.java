class StaticExample2
{

int a =10;
static int b =20;

public static void main(String args[])
{

StaticExample2 se1 = new StaticExample2();
StaticExample2 se2 = new StaticExample2();


System.out.println(" Before modifying se1.a=="+se1.a);
System.out.println(" Before modifying static variable===="+b);


System.out.println(" Before modifying se2.a=="+se2.a);
System.out.println(" Before modifying static variable =="+b);




StaticExample2 se3 = new StaticExample2();


se3.a = 30;
b=50;


System.out.println(" I am instance variable modified. se1.a=="+se1.a);
System.out.println(" I am static variable after modifying===. se1.b"+b);


System.out.println(" I am instance variable after modified===se2.a"+se2.a);
System.out.println(" I am static variable after modified===se2.b"+b);



System.out.println(" I am instance variable after modified===se3.a"+se3.a);

System.out.println(" I am static variable after modifying=======se3.b"+b);

}
}