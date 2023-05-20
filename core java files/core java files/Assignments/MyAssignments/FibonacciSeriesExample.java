 class FibonacciSeriesExample
//if the class is public the file name should be public as same file name

{

public static void main(String args[])
{

int number =10;

int firstnumber = 0, secondnumber = 1, temp;

System.out.println(firstnumber);0
System.out.println(secondnumber);1

for(i=3;i<= number;;)
{

temp = firstnumber+secondnumber;

System.out.println(temp);           

firstnumber = secondnumber;
secondnumber = temp;


}
 
}
}