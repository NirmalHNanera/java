import java.util.Scanner;
class Result
{
	String Sname;
	int SrollNO;
	Float Spercentage;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		Sname=sc.next();
		System.out.println("Enter Student RollNo:");
		SrollNO=sc.nextInt();
		System.out.println("Enter Student Percentage:");
		Spercentage=sc.nextFloat();
	}
	void displaydata()
	{
		System.out.println("Student Name-"+Sname);
		System.out.println("Student RollNo-"+SrollNO);
		System.out.println("Student Percentage-"+Spercentage);
	}
}
class Studentdemo
{
	public static void main(String[] args) 
	{
		Result s1=new Result();
		Result s2=new Result();
		s1.setdata();
		
		s1.displaydata();
		s2.setdata();
		s2.displaydata();
	}
}