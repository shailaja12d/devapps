import java.util.*;

public class PracticeCollection
{

public static void main(String args[]) throws Exception
{

ArrayList al = new ArrayList();

 ArrayList  c = new ArrayList();

//when I mention as collections interface is not working to add the elements.

 c.add("swathi");
 c.add("latha");
 c.add("jyothi");

Iterator i =  c.iterator();
while(i.hasNext())
{
System.out.println(i.next().equals("shailaja"));
}


/*
for(int i =0;i<=c.size();i++)
{
System.out.println(c.get(i));
}
*/ 

c.forEach( (element)-> System.out.println(element));


 al.add(0,10);
 al.add("shailaja");
 al.addAll(c);


//Integer a = (Integer)al.get(2);// why not we convert to wrapper classes? Not only wrapper //classs if I mention list and array list ,List,Iteratorable also other than the object


Object a = al.get(2);


//System.out.println(a);

ArrayList a3 = (ArrayList)al.clone();

al.ensureCapacity(10000);

//System.out.println(al);
//System.out.println(a3);

}
}