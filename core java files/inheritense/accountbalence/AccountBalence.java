import java.io.*;

class AccountBalence
{

public static void main(String args[])throws IOException
{

 FriendAccountBalence fab = new  FriendAccountBalence();
ShailajaAccountBalence sab = new ShailajaAccountBalence();

System.out.println("please enter the amount which you need to transfer"+10000);


InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(r);



//String inputtransferamount = br.nextLine();
String inputtransferamount = br.readLine();
	
int transferamount = Integer.parseInt(inputtransferamount);

System.out.println(sab);


 sab.payment(transferamount );
fab.paymentRecieved(transferamount );


}
}