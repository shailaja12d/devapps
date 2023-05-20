//2)


class MethodOverridingParent
{
public void m1()
{

System.out.println("parent class method");
}


}

class MethodOverridingChild extends  MethodOverridingParent
{

private void m1()
{

System.out.println("child class method");
}

public static void main(String args[])
{

 MethodOverridingChild mm = new  MethodOverridingChild();

//MethodOverridingParent mm = new MethodOverridingParent();
 mm.m1();


}
}