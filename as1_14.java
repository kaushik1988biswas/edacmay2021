public class as1_14
{
    public static void main(String args[])
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=11;j++)
            {
                if(i>=1&&i<=10&&j==1||i>=1&&i<=10&&j==3||i>=1&&i<=10&&j==5||i>=1&&i<=10&&j==7||i>=1&&i<=10&&j==9)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=20;j++)
            {
                System.out.print("=");
            }
            System.out.println();
            for(int j=1;j<=11;j++)
            {
                if(i>=1&&i<=10&&j==2||i>=1&&i<=10&&j==4||i>=1&&i<=10&&j==6||i>=1&&i<=10&&j==8)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=20;j++)
            {
                System.out.print("=");
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=31;j++)
            {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}