package java_practice;

import java.util.Scanner;

public class p8 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>=y && x>=z)
		{
			System.out.println("greatest number: "+x);
		}
		else if(y>=x && y>=z)
		{
			System.out.println("greatest number: "+y);
		}
		else
		{
			System.out.println("greatest number: "+z);
		}
	}
}
