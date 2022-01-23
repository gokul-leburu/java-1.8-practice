package java_practice;

import java.util.Scanner;
public class p5 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("before swap: x is "+x+" y is "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swap: x is "+x+" y is "+y);
	}
}