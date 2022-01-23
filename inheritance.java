package java_practice;

class a {
	int x;
	public void print()
	{
		 System.out.println(x);
	}
}
class b extends a
{
	int y;
	b(int y,int x)
	{
		this.x=x;
		this.y=y;
	}
	public void print()
	{
		System.out.println(x+" "+y);
	}
}
public class inheritance extends a
{
	public void print()
	{
		 System.out.println("hello");
		 super.print();
	}
	public static void main(String [] args)
	{
		inheritance h= new inheritance();
		h.print();
	}
}
