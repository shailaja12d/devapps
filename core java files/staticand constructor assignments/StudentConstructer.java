class StudentConstructer
{

int sno;
String name;
int marks;


 StudentConstructer(int sno,String sname,int marks)
{
this.sno=sno;
this.name=sname;
this.marks=marks;
}


public static void main(String args[])
{


StudentConstructer sc = new StudentConstructer(11,"shailaja",50);

System.out.println("student number is. ===="+sc.sno);
System.out.println("student number is. ===="+sc.name);
System.out.println("student number is. ===="+sc.marks);

StudentConstructer sc1 = new StudentConstructer(12,"Rohan",60);

System.out.println("student number is. ===="+sc1.sno);
System.out.println("student number is. ===="+sc1.name);
System.out.println("student number is. ===="+sc1.marks);

}
}