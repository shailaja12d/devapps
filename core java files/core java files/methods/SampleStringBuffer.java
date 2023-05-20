public class SampleStringBuffer
{
public static void main(String args[])
{

StringBuffer sb = new StringBuffer("Shailaja");



String s1 = new String("Shailaja");

sb.append("dugyala");

String s3 =s1.concat("dugyala");
//s1.concat("dugyala");

System.out.println("sb1.         "+sb); shailaja Dugyala
System.out.println("              "+s1);shailaja
System.out.println("sb1.         "+s3); Shailaja

}
}