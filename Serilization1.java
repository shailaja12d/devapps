package corejava;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Serilization1 implements Serializable
{
	
	public static void main(String args[])

	{
		Serilization1 s1 = new Serilization1();
		try
		{
			 FileOutputStream f1=new FileOutputStream("f.txt");
			 ObjectOutputStream out = new ObjectOutputStream(f1);
			 out.writeObject(s1);
			 System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println("hello"+e);
		}
	}
}
