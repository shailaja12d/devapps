import java.util.*;

class Calculator

{

public static void main(String args[])
{

int x=10;

int y=20;

int Z;
int result;

System.out.println("enter the operation");

Scanner sn = new Scanner(System.in);

//int p = Integer.parseInt(sn.nextLine());

   
   
char c = sn.next().charAt(0);  

if( c == '+')

{

result = x  + y;

System.out.println(result);

}

else

if(c == '-' )

{

 result = x - y;

System.out.println(result);

}
else

if(c == '*')

{

result  = x * y;

System.out.println(result);

}

if(c == '%')

{

result = x % y;


System.out.println(result);

}


}

}






