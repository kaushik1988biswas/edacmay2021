import java.util.Scanner;
public class as1_7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int mul;
        for(int i=1;i<=10;i++)
        {
            mul=a*i;
            System.out.println(a+"x"+i+"="+mul);
        }
    }
}