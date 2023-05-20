class fighter
{

public int m1(ObjectsMethod1 ob1)
{
System.out.println("m1========");
return 50;
}
public int m1(ObjectsMethod2 ob2)
{

System.out.println("m2========");

return 10;
}
public int m1(ObjectsMethod2 ob2 ,ObjectsMethod3 ob3)
{
System.out.println("m3========");

return 20;
}
public int m1(ObjectsMethod2 a, ObjectsMethod3 b,ObjectsMethod4 c)
{
System.out.println("m4========");

return 30;
}

public static void main(String args[])
{

fighter f = new fighter();

ObjectsMethod1 ob1 = new ObjectsMethod1();
ObjectsMethod2 ob2 = new ObjectsMethod2();
ObjectsMethod3 ob3 = new ObjectsMethod3();
ObjectsMethod4 ob4 = new ObjectsMethod4();




int ob5 = f.m1(ob1);
int ob6 = f.m1(ob2);
int ob7 = f.m1(ob2,ob3);
int ob8 = f.m1(ob2,ob3,ob4);
}
}