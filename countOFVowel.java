import java.util.Scanner;
class countOFVowel
{
  public static void main(String[] arg)  
  {
  	Scanner sc=new Scanner(System.in);
  	int count = 0;
    String sentence;
  	do
    {
      System.out.println("Enter  A sentence:"); 
       sentence=sc.nextLine();  
      char ch;
      for(int i = 0;i<sentence.length()-2;i++)
      {
        ch = sentence.charAt(i);
        if(ch=='A'||ch=='a'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
          {
            count++;
          }

      }
    }
  while(!sentence.equals("quit"));
System.out.println("VOWELS IS :"+count);
}

}






