import java.util.*;
import java.lang.*;
class as1_22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary digit");
		int a=sc.nextInt();
		int temp,decimal=0,i=0,conv;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			conv=(int)(Math.pow(2,i));
			decimal=decimal+(temp*conv);
			//System.out.print(i);
			i++;
			//System.out.print(conv+" ");
			//System.out.print(decimal+" ");
		}
		System.out.print("Your decimal number for the entered binary is: "+decimal);
	}
}