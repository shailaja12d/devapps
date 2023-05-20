class StaticMethodAndMainMethodResult1
{
//int a = 0;
//int b = 0;

public  StaticMethodAndMainMethodResult1(int a,int b)

{

int c= a+b;

System.out.println("c value is"+c);

}

public static void main(String args[])
{

StaticMethodAndMainMethodResult1 sm =new StaticMethodAndMainMethodResult1(10,70);


//  int result = StaticMethodAndMainMethodResult1.methodOfstatic(10,70);

// System.out.println(". I am printing the result of static method =="+result);


}
}