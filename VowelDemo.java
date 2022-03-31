import java.util.Scanner;
class VowelDemo
{
  public static void main(String[] arg)  
  {
  	Scanner sc=new Scanner(System.in);
  	int count = 0;
  	System.out.println("Enter  A sentence:"); 
    String sentence=sc.nextLine();  
    char ch;
    for(int i = 0;i<sentence.length();i++)
    {
    	ch = sentence.charAt(i);
    	if(ch=='A'||ch=='a'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
    	{
    		count++;
    	}
    	else if(ch = 'quit' || ch = 'QUIT')
    	{
    		break;
    	}
    }
    System.out.println("No. of VOWELS:"+count);
  }
 }

