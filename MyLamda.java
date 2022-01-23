package java_practice;

import java.util.*;
interface FunctionType
{
	public void excute(String s);
}
interface compareToString
{
	public int excute(String s,String s2);
}
interface even_odd
{
	public String excute(int a);
}
interface positive_negative
{
	public String excute(int a);
}
interface upper
{
	public void excute(String s);
}
public class MyLamda  {
	public static void main(String args[])
	{
		String x="gokul";
		
		FunctionType code=(s) -> System.out.println(s.length());
		code.excute(x);
		
		compareToString code1=(s,s1) -> s.compareTo(s1);
		System.out.println(code1.excute("gokul1","gokul"));
		
		even_odd code2=(a)-> {if(a%2==0) return "even"; else return "odd";};
		System.out.println(code2.excute(5));
		
		positive_negative code3=(a)->{if(a>0) return "positive"; else return "negative";};
		System.out.println(code3.excute(-4));
		
		upper code4=(s)-> System.out.println(s.toUpperCase());
		code4.excute("bajaj");
		
		code4.excute(code3.excute(-4));
	}
	
	
	
	

}
