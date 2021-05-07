import java.util.Scanner;
public class as1_19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
		int a=sc.nextInt();
		int i=0;
		int b[]=new int[8];
		while(a>0)
		{
			b[i++]=a%2;
			a=a/2;
		}
		System.out.print("The binary equivalent of entered decimal is: ");
		for(int j=7;j>=0;j--)
		{
			System.out.print(b[j]);			
		}
		
	}	                                
}