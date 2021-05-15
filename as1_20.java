import java.util.*;
public class as1_20
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal you want to convert to hexadecimal");
		int a=sc.nextInt();
		int b[]=new int[10];
		for(i=0;i<b.length;i++)
		{
			b[i]=a%16;
			a=a/16;
		}
		--i;
		for(int j=0;j<b.length;j++)
		{
			if(b[j]==10)
			{
				b[j]='A';
			}
			if(b[j]==11)
			{
				b[j]='B';
			}
			if(b[j]==12)
			{
				b[j]='C';
			}
			if(b[j]==13)
			{
				b[j]='D';
			}
			if(b[j]==14)
			{
				b[j]='E';
			}
			if(b[j]==15)
			{
				b[j]='F';
			}
		}
		while(i>=0)
		{
			if(b[i]==0||b[i]==1||b[i]==2||b[i]==3||b[i]==4||b[i]==5||b[i]==6||b[i]==7||b[i]==8||b[i]==9)
			{
				System.out.print(b[i--]+" ");
			}
			else
			{
				System.out.print((char)b[i--]+" ");
			}
		}
	}
}