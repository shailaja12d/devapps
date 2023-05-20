class ArrayAdditionExample
{
public static void main(String args[])
{
int sum =0;
int ii[] = new int[7];
//{10,30,20,40,40,50};

ii[0]= 20;
ii[1]= 30;
ii[2]= 40;
ii[3]=50;
ii[4]=60;
ii[5]=50; 

//ii[]={10,30,20,40,40,50};




for(int p=0;p<ii.length;p++)
{

sum= sum+ii[p];

}
System.out.println("shailaja"+sum);

}
}