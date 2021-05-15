import java.util.*;
class as1_18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first binary digit");
		int a=sc.nextInt();
		System.out.println("Enter Second binary digit");
		int b=sc.nextInt();
		int i=0,c=0,res=0;
		int s[]=new int[8];
		while(a!=0||b!=0)
		{
			s[i++]=(a%10+b%10+c)%2;
			c=(a%10+b%10+c)/2;
			b=b/10;
			a=a/10;
		}
		if(c!=0)
		{
			s[i++]=c;
		}
		i--;
		while(i>=0)
		{
			res=res*10+s[i--];
		}
		System.out.print("Multiplication result is: "+res);
	}
}