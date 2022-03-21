import java.util.Scanner;
class student
{
	int rollno;
	String name;
	int age;

	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter RollNo:");
		rollno=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Age:");
		age=sc.nextInt();
	}
	void displaydata()
	{
		System.out.println("RollNo.-"+rollno);
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
	}
}
class studentsdemo
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student();
		s1.setdata();
		s2.setdata();
		s1.displaydata();
		s2.displaydata();
	}
	
}