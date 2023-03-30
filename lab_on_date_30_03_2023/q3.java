package lab_on_date_30_03_2023;
public class q3 {
	int age;
	String name;
	String address;
	//parameterized cons where we have to pass the parmeters/ arguments
	q3(int a, String n, String b)
	{
		age =a;
		name = n;
		address= b;
	}
	void show()
	{
		System.out.println(age+ " "+name+" "+address);
	}
	public static void main(String [] args)
	{
		q3 d= new q3(20, "laxmi","solapur");
		q3 d1= new q3(23, "nandini","pune");
		q3 d2= new q3(24, "veena","mumbai");
		q3 d3= new q3(14, "rasika","hyadrabad");
		q3 d4= new q3(24, "vedika","goa");
		d.show();
		d1.show();
		d2.show();
		d3.show();
		d4.show();
		
	}
	}


