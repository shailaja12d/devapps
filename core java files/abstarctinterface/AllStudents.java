
interface college
{

public abstract void staff(String maths, String physics,String chemistry);
public abstract void staff(String biology, String chemistry);
public abstract void staff(String AI,String statistics);

}

class Students implements college
{

 public void staff(String maths, String physics,String chemistry)
{
Sytem.out.println("I am student of maths and physics");

}

public void staff(String biology, String chemistry)
{
Sytem.out.println("I am student of biology");

}
}

class AllStudents extends Students implements college
{

public void staff(String AI,String statistics)
{
Sytem.out.println("I am student of AI");
}


public static void main(String args[])
{

AllStudents as = new AllStudents();
as.staff("AI","statistics");

Students s = new Students();
s.staff("maths","physics","chemistry");
}
}