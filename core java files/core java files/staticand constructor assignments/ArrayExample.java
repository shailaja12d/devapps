class ArrayExample
{

public static void main(String args[])
{
int a[] =  new int[10];

a[0] =100;
a[1] =2;
a[2] =3;
a[3] =4;
a[4] =5;
a[5] =6;
a[6] =7;
a[7] =8;
a[8] =9;
a[9] =10;


for(int i=0;i<10;i++)
{
System.out.println("before reverse  array vales are"+a[i]);

}
for(int i=10;i>0;i--)
{
System.out.println("before reverse  array vales are"+a[i]);
}

ArrayExample ae = new ArrayExample();

ae.method(a);

}

public int[] method(int a[])
{
int b[] =a ;

return b;
}
}