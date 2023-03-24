package lab;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		int num,cube;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			cube=i*i*i;
			System.out.print("Cube of " + i);
			System.out.println(" = " + cube);			
		}
	}
}