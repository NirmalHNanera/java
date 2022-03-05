import java.util.Scanner;
public class pattern11
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==1||i==n)
			{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			}
			else
			{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
			}
		}
	}
}