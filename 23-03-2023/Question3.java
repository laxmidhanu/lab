package lab;
import java.util.Scanner;
public class Question3 {
	public static  void main(String[] args) {
		int num;
		System.out.println("Enter any Number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if (num<0){
			System.out.println(num + " is Negative Number.");
		}
		else if(num>0) {
			System.out.println(num + " is Positive Number.");
		}
		else
			System.out.println("Number is Zero");
	}
}
