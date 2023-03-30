package lab_on_date_30_03_2023;
import java.util.Scanner;
public class q2 {
	int area, length, breadth; 
	    
	   void RectangleArea(int l, int b) 
	   { 
		   length = l; 
		      breadth = b; 
	      area = length * breadth; 
	      System.out.println("Area of Rectangle : " + area); 
	   }  
	   
	

   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
      q2 r = new q2(); 
      r.RectangleArea(10,20);
   }


}