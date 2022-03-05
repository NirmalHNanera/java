import java.util.Scanner;
public class onetoN{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		
	}
}