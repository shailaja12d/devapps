class MethodTraversingHelper
{

final int z =10;

 MethodTraversingHelper mth = new MethodTraversingHelper();


public int method1(String name,int a)
{

System.out.println(name+" having before passing  the value ="+a);

int z = 100 - z;

System.out.println(name+"shailaja having after passing the value="+z);

mth.method2("manasa", z);

return z;

}

public int method2(String name,int b)
{



System.out.println(name+" having before passing  the value ="+b);

int c = b - z;

System.out.println(name+"manasa having after passing the value="+c);

mth.method3("rohan",c);

return c;

}

public int method3(String name,int c)
{


System.out.println(name+" Rohan having before passing  the value ="+c);

int d = c - z;

System.out.println(name+" rohan having after passing the value="+d);

mth.method4("reesha", d);

return d;

}


public int method4(String name,int d)
{


System.out.println(name+" Reesha having before passing  the value ="+d);

int e = d - z;

System.out.println(name+" reesha having after passing the value="+d);

return e;

}
}
