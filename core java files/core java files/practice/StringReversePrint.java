class  StringReversePrint
{
public static void main(String args[])
{

//char ch[] = new char[10];

String s = "janisir";

char ch[] = s.toCharArray();



for( int p=ch.length-1; p>=0; p--)
{



System.out.print(ch[p]); 

}
}
}