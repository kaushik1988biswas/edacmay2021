import java.util.*;
import java.lang.*;
class as1_25
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal digit");
		int a=sc.nextInt();
		int temp,d=0,i=0,conv;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			conv=(int)(Math.pow(8,i));
			d=d+(temp*conv);
			//System.out.print(i);
			i++;
			//System.out.print(conv+" ");
			//System.out.print(decimal+" ");
		}
		System.out.println("Your decimal number for the entered octal is: "+d);
	}
}
