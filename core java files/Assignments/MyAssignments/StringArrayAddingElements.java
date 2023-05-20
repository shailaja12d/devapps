public class StringArrayAddingElements
{

public static void main(String args)
{

String[] sa ={"A","B","C"};

System.out.println("initial Array"+Arrays.toString(sa));

int length_Var = sa.length;

String newElement="D";
String[] newArray = new String[length_Var+1];

for(int i=0;i<sa.length;i++)

{

newArray[i]=sa[i];

}
newArray[newArray.length-1]= newElement;

sa= newArray;
System.out.println("updated Array"+Arrays.toString(sa));
}
}

