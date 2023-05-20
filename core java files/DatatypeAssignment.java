class DatatypeAssignment
{

static int number =10;

 int instancevariable = 20 ;

public static void main(String args[])
{

//int instancevariable = 200;

DatatypeAssignment da= new DatatypeAssignment();
DatatypeAssignment da1= new DatatypeAssignment();
DatatypeAssignment da2= new DatatypeAssignment();
DatatypeAssignment da3= new DatatypeAssignment();

 da.number = 100;
 da.instancevariable =30;

 //da1.instancevariable= 40;
// da2.instancevariable = 50;
 //da3.instancevariable= 60;


//System.out.println(number);
c(da.number);

System.out.println(da.number);
System.out.println(da1.number);
System.out.println(da2.number);
System.out.println(da3.number);


/*System.out.println(DatatypeAssignment.instancevariable);

System.out.println(DatatypeAssignment.number);

System.out.println(da.instancevariable);

System.out.println(da1.instancevariable);

System.out.println(da2.instancevariable);

System.out.println(da3.instancevariable);*/

}




}