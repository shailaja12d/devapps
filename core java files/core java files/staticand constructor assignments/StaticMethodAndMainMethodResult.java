class StaticMethodAndMainMethodResult
{

public static int methodOfstatic(int a,int b)
{


//int a =10;
//int b=70;
int c= a+b;
return c;

}

public static void main(String args[])
{

//StaticMethodAndMainMethodResult sm =new StaticMethodAndMainMethodResult();


  int result = StaticMethodAndMainMethodResult.methodOfstatic(10,70);

System.out.println(". I am printing the result of static method =="+result);


}
}