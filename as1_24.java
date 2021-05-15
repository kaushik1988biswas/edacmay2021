	
		int b[]=new int[10];
		for(i=0;i<b.length;i++)
		{
			b[i]=d%8;
			d=d/8;
		}
		--i;
		System.out.print("Your octal number is: ");
		while(i>=0)
		{
			System.out.print(+b[i--]+" ");
		}
	}
}