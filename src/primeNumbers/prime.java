package primeNumbers;
import java.util.Scanner;

public class prime {

	public static void main(String arg[])	
	{
	int i,count;
        System.out.print("Bir sayi giriniz : ");
	Scanner primeNumberScanner =new Scanner(System.in);
	int inputNumber=primeNumberScanner.nextInt();
        System.out.println("1 ile "+inputNumber+" arasındaki asal sayılar: ");
	for(int j=2;j<=inputNumber;j++)
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
	

