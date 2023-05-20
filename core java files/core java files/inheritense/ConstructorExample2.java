class ConstructorExample2
{
 int sno;
 String sname;
 int marks;

/*

static int sno;
static String sname;
static int marks;
*/

ConstructorExample2(int sno,String sname,int mark)
{
this.sno = sno;
this.sname = sname;
this.marks = marks;

}




public static void main(String args[])
{

ConstructorExample2 ce = new ConstructorExample2(10, "shailaja",100);

//System.out.println("student no is"+sno);

}
}