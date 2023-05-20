
interface college
{

public abstract void staff(String maths, String physics,);
public abstract void student(String biology, String chemistry);


}

class InterfaceOverLoading implements college
{

 public void staff(String maths, String physics, String psychology)
{
System.out.println("I am student of maths and physics");
}

public void staff(String biology, String chemistry)
{
System.out.println("I am student of biology");

}
}


class AllStudents extends Students implements college
{

public void staff(String AI,String statistics)
{
System.out.println("I am student of AI");
}


public static void main(String args[])
{

AllStudents as = new AllStudents();
as.staff("AI","statistics");

}
}