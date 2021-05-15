import java.util.*;
public class as1_21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal you want to convert to octal number: ");
		int a=sc.nextInt();
		int i;
		int b[]=new int[10];
		for(i=0;i<10;i++)
		{
			b[i]=a%8;
			a=a/8;
		}
		i--;
		System.out.println("your octal no is: ");
		while(i>=0)
		{
			System.out.print(b[i--]);
		}
	}
}