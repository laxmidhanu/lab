package lab_on_date_30_03_2023;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        System.out.print("The smallest value is " + the_thire_no(a, b, c)+"\n" );
    }

   public static int the_thire_no(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }
}
