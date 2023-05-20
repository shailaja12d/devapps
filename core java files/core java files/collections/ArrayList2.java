

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2
{

public static void main(String args[])
{
List list = new ArrayList();

list.add("shailaja");
list.add("swathi");
list.add("aruna");
list.add("aruna");
list.add("reesha");
list.add("kavitha");
list.add("geetha");


ListIterator listIterator = list.listIterator();

while(listIterator.hasPrevious())
{
System.out.println(listIterator.previous());
}


//System.out.println(" I am printing my last index"+list.lastIndexOf("aruna"));

}
}
