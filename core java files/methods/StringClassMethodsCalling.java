import java.sql.*;

class  StringClassMethodsCalling
{

public static void main(String args[])
{

int a =10;	
String s = new String("                                       HI                    Shailaja D ");



System.out.println("printing object reference ="+s.hashCode());
System.out.println(" String Length  "+s.length());
System.out.println(" String in Uppercase "+s.toUpperCase());
System.out.println(" String in lowercase  "+s.toLowerCase());
System.out.println(" I am doing trim of  this msg  "+s.trim());

System.out.println(" String int value is  "+s.valueOf(4));
System.out.println(" String float value is "+s.valueOf(44.4));
System.out.println(" String double value is "+s.valueOf(44324343434343.4));
System.out.println("");
System.out.println(" I am repeating my string 5 time = "+s.repeat(5));

System.out.println("");
System.out.println(" String long value is  "+s.valueOf(10l));
System.out.println(" I am printing mentioned characters  "+s.valueOf('s'));
System.out.println(" I am giving 40 spaces before String  "+s.indent(40));

System.out.println(" strip leading  msg  "+s.stripLeading());




//System.out.println("I am a value of code point"+s.valueOfCodePoint(4));

//System.out.println(" strip leading  msg  "+s.isLatin1());
//System.out.println(" String int value is  "+StringClassMethodsCalling.checkIndex(4, 8));


/*


  public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
  static java.lang.String join(java.lang.String, java.lang.String, java.lang.String, java.lang.String[], int);
  public static java.lang.String join(java.lang.CharSequence, java.lang.Iterable<? extends java.lang.CharSequence>);
  public java.lang.String toLowerCase(java.util.Locale);



  public java.lang.String toUpperCase(java.util.Locale);
 
  public java.lang.String trim();
  public java.lang.String strip();
  public java.lang.String stripLeading();
  public java.lang.String stripTrailing();
  public static java.lang.String valueOf(boolean);



*/


}

}