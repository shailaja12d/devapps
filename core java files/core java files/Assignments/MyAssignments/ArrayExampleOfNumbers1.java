class ArrayExampleOfNumbers1
{

public static void main(String args[])
{

int a[] =new int[6];


a[0] =21;
a[1] =22;
a[2] =23;
a[3] =26;
a[4] =50;
a[5] =33;


System.out.println("array length is" +a.length);

for(int i=0;i<a.length;i++) 

//for(int i=a.length;i>1;i--)

{


System.out.println("array value"+a[i]);


}

}


}