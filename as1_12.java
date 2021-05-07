import java.util.Scanner;
public class as1_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        float a=sc.nextFloat();
        System.out.println("Enter Second number: ");
        float b=sc.nextFloat();
        System.out.println("Enter third number: ");
        float c=sc.nextFloat();
        float avg;
        avg=(a+b+c)/3;
        System.out.println("Average is: "+avg);
    }
}