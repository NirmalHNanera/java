class Counter
{
	static int count = 0;
	Counter()
	{
	count++;
	}
	void display()
	{
		System.out.println("counter:"+count);
	}
}
class CounterDemo 
 { 
         public static void main(String[] arg)  
         { 
                 Counter C1=new Counter(); 
                 C1.display();
                 Counter C2=new Counter();
                 C2.display();
                 Counter C3=new Counter();
                 C3.display();
                 
         } 
 }