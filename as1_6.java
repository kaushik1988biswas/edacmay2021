import java.util.Scanner;
public class as1_6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the secong number: ");
        int b=sc.nextInt();
        int plus, minus, mul, div, mod;
        plus=a+b;
        minus=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}