package java_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	public static void main(String [] args)
	{
		Set<MyStudent> studentset=new TreeSet<MyStudent>(new SortByFee());
		studentset.add(new MyStudent(435,"gokul",70020));
		studentset.add(new MyStudent(123,"gokul2",40000));
		studentset.add(new MyStudent(234,"gokul3",50000));
		
		studentset.forEach(
			(str)->System.out.println(str)
		);
		
		
		
	}
	
	
	
}
