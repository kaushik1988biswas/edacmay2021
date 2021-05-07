public class as1_8
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i>=0&&i<=3&&j==4||i==3&&j==1||i==4&&j>=2&&j<=3)
                    System.out.print("J");
                else
                    System.out.print(" ");
            }
            for(int k=1;k<=7;k++)
            {
                if(i==1&&k==4||i==2&&k==3||i==2&&k==5||i==3&&k>=2&&k<=6||i==4&&k==1||i==4&&k==7)
                    System.out.print("A");
                else
                    System.out.print(" ");
            }
            for(int l=1;l<=7;l++)
            {
                if(i==1&&l==1||i==1&&l==7||i==2&&l==2||i==2&&l==6||i==3&&l==3||i==3&&l==5||i==4&&l==4)
                    System.out.print("V");
                else
                    System.out.print(" ");
            }
            for(int k=1;k<=7;k++)
            {
                if(i==1&&k==4||i==2&&k==3||i==2&&k==5||i==3&&k>=2&&k<=6||i==4&&k==1||i==4&&k==7)
                    System.out.print("A");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}