package primeNumbers;
import java.util.Scanner;

public class prime {

	public static void main(String arg[])	
	{
	int i,count;
    System.out.print("Bir say� giriniz : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    System.out.println("1 ile "+n+" aras�ndaki asal say�lar: ");
	for(int j=2;j<=n;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.println(j+"  ");     
	}}}
	

