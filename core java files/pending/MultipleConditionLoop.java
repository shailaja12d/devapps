

import java.util.*;

class MultipleConditionLoop

{

public static void main(String args[])

{

Scanner sn = new Scanner(System.in);


System.out.println("enter the age");



int age = Integer.parseInt(sn.nextLine());


if(age <= 20)

{

System.out.println("Not eligible to accesss internet");

}


else

if(age >=21 && age <= 59)

{

System.out.println("Not eligible for school");

}

else

if(age >= 60 && age <= 80)

{


System.out.println("Not eligible for pension");

}

}
}



