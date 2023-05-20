

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ArrayList1
{

public static void main(String args[])
{
List list = new ArrayList();

list.add("shailaja");
list.add("swathi");
list.add("aruna");

List l1= new ArrayList();

l1.add(30);
l1.add(40);
l1.add(40);
l1.add(50);
list.addAll(l1);
list.remove("swathi");
list.removeAll(l1);
list.add("aruna");

Iterator i = list.iterator();

while(i.hasNext()){

System.out.println(i.next().equals("shailaja"));

//System.out.println(list);
}

System.out.println(" I am printing my last index"+list.lastIndexOf(40));

//System.out.println(i.next().remove("shailaja"));



//System.out.println(list.indexOf("aruna"));
//System.out.println(l1);

//System.out.println("comparing with .equals"+"swatha".equals("shailaja"));

}
}