import java.util.Scanner;
public class pattern8
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		for(int i=65;i<=n;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.print("\n");
		}
		
	}
}