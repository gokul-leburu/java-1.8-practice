package java_practice;

import java.util.Scanner;

public class Main {
	public void even_odd(int x)
	{
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int a=0;
		int b=1;
		if(x==1)
		{
			System.out.println(a);
		}	
		else if(x==2)
		{
			System.out.println(a);
			System.out.println(b);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			for(int i=3;i<x;i++)
			{
				int temp=b;
				b=a+b;
				a=temp;
				System.out.println(a);
			}
			System.out.println(b);
		}
		sc.close();
	}
}
