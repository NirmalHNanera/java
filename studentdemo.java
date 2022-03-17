class student
{
	int rollno;
	String name;
	int age;

	void setdata(int r,String n,int a)
	{
		rollno=r;
		name=n;
		age=a;
	}
	void displaydata()
	{
		System.out.println("RollNo.-"+rollno);
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
	}
}
class studentdemo
{
	public static void main(String[] args) {
		student s1=new student();
		s1.setdata(101,"raj",18);
		s1.displaydata();
	}
}