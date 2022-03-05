import java.util.Scanner;
public class evenNO
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
		
	}
}