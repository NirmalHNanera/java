import java.util.Scanner;
class customer
{
	int custID;
	String cname;
	String cmobileNO;

	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer ID:");
		custID=sc.nextInt();
		System.out.println("Enter customer Name:");
		cname=sc.next();
		System.out.println("Enter customer Mobile number:");
		cmobileNO=sc.next();
	}
	void displaydata()
	{
		System.out.println("customer ID-"+custID);
		System.out.println("customer Name-"+cname);
		System.out.println("Customer mobile number-"+cmobileNO);
	}
}
class Customerdemo
{
	public static void main(String[] args) 
	{
		customer c1=new customer();
		customer c2=new customer();
		c1.setdata();
		
		c1.displaydata();
		c2.setdata();
		c2.displaydata();
	}
}