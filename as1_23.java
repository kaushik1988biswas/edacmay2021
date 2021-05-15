import java.util.*;
import java.lang.*;
class as1_23
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary digit");
		int a=sc.nextInt();
		int temp,d=0,i=0,conv;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			conv=(int)(Math.pow(2,i));
			d=d+(temp*conv);
			//System.out.print(i);
			i++;
			//System.out.print(conv+" ");
			//System.out.print(decimal+" ");
		}
		System.out.println("Your decimal number for the entered binary is: "+d);
		int b[]=new int[10];
		for(i=0;i<b.length;i++)
		{
			b[i]=d%16;
			d=d/16;
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
		//System.out.println("Your hexadecimal no is: ");
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