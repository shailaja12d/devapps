class  StudentMarksPercentageHelperClass
{

public int totalMarks(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6)
{

int totalmarks= sub1+sub2+sub3+sub4+sub5+sub6;


System.out.println("totalmarks = "+totalmarks);

return totalmarks;

}



public void percentageOfMarks(int totalmarks)
{
int marks = totalmarks;

if(marks>=500)
{
System.out.println("first-class ");
} else 

if(marks>=400 && marks <=300)
{
System.out.println("Second class");
} else
if(marks<400)
{
System.out.println("third class");
}


} 

}