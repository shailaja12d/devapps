class DifferentObjectsCallingMethods
{

public ObjectsMethod1  method1(ObjectsMethod1 ob1)
{

 System.out.println("I am from method1");
return ob1;
}


public ObjectsMethod2 method1(ObjectsMethod1 ob1,ObjectsMethod2 ob2)
{

System.out.println("I am from method2");
return ob2;
}


public ObjectsMethod3 method1(ObjectsMethod1 ob1,ObjectsMethod2 ob2,ObjectsMethod3 ob3)
{

System.out.println("I am from method3");

return ob3;
}

public ObjectsMethod4 method1(ObjectsMethod1 ob1,ObjectsMethod2 ob2,ObjectsMethod3 ob3,ObjectsMethod4 ob4)
{

System.out.println("I am from method4");
 return ob4;
}


public static void main(String args[])
{

DifferentObjectsCallingMethods dm = new DifferentObjectsCallingMethods();

ObjectsMethod1 ob1 = new ObjectsMethod1();
ObjectsMethod2 ob2 = new ObjectsMethod2();
ObjectsMethod3 ob3 = new ObjectsMethod3();
ObjectsMethod4 ob4 = new ObjectsMethod4();

ObjectsMethod1 ob1result = dm.method1(ob1);
ObjectsMethod2 ob2result = dm.method1(ob1,ob2);
ObjectsMethod3 ob3result = dm.method1(ob1,ob2,ob3);
ObjectsMethod4 ob4result = dm.method1(ob1,ob2,ob3,ob4);



System.out.println("I am done my work"+ob1);

}
}