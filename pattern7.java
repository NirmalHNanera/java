import java.util.Scanner;
public class pattern7
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
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		
	}
}