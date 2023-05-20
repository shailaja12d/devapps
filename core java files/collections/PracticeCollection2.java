import java.util.*;

public class PracticeCollection2
{

public static void main(String args[]) throws Exception
{

Set s = new HashSet();

 s.add("swathi");
 s.add("latha");
 s.add("jyothi");

Set ss = Collections.synchronizedSet(s);

Iterator i =  ss.iterator();

while(i.hasNext())
{
//System.out.println(i.next().equals("shailaja"));
System.out.println(i.next());
}

System.out.println(s);
}

}

/*
What is servant
What is restful web services
Explain about restful web services
What is database
What is tsp
What is framework
*/

