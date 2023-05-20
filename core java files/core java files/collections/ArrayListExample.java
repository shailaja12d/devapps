import java.util.*;  

 public class ArrayListExample
{  
 public static void main(String args[]){ 

//int ls =0 ;

  ArrayList os =new ArrayList();   

      os.add("manasa");
      os.add ("SHAILU"); 
      os.add("rohan");
      os.add("reesha");    
    
   // ls.addAll(os);

     os.remove("manasa");

  System.out.println(os);

   int  Arraysize = os.size();
  System.out.println(Arraysize);    

  public boolean isEmpty() {
        return size == 0;
 
 }  
} 
