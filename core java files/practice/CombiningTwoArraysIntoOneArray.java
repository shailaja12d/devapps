
class CombiningTwoArraysIntoOneArray
{

public static void main(String args[])
{

int a[] = new int[5];

a[0] =10;
a[1] =20;
a[2] =30;
a[3] =40;
a[4] =50;

int b[] = new int[5];

b[0] =60;
b[1] =70;
b[2] =80;
b[3] =90;
b[4] =100;

int c[] = new int[10];

//for(int d=c.length-1;d>=0;d--)



c[0] =a[0];
c[1] =a[1];
c[2] =a[2];
c[3] =a[3];
c[4] =a[4];
c[5] =b[0];
c[6] =b[1];
c[7] =b[2];
c[8] =b[3];
c[9] =b[4];

for(int d=0;d<=c.length-1;d++)



{



System.out.println(c[d]);
}
}
}