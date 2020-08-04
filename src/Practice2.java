import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any first number");
        int num1 = in.nextInt();
        System.out.println("enter any last number");
        int num2 = in.nextInt();
        int i = 1;
        int num3=3,num4=4, num5 =5 , num6 = 6;
        do {
            System.out.println( +i +   "  " +num1 * i +"  "+num3  * i +"  "+num4 * i +"  "+num5 * i +"  "+num6 * i);
            i++;
        }
        while (i<=num2);



    }

}