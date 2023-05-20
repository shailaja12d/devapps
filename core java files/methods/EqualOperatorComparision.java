class EqualOperatorComparision
{
int  a = 20;
public static void main(String args[])
{

EqualOperatorComparision ec1 = new EqualOperatorComparision();
EqualOperatorComparision ec2 = new EqualOperatorComparision();

if(ec1 ==ec2)
//if(ec1.equals(ec2))
{
System.out.println("objects are same");

}else

{
System.out.println("objects are not same");
}

//System.out.println(" ec1 adress is="+ec1.hashcode());
//System.out.println(" ec2 adress is="+ec2.hashcode());

}
}

