import java.util.Scanner;
public class divisibleBY7
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
			
		}
		
	}
}