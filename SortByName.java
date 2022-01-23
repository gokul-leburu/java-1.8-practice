package java_practice;

import java.util.Comparator;

public class SortByName implements Comparator<MyStudent> {
	
	public int compare(MyStudent s1,MyStudent s2)
	{
		return s1.getName().compareTo(s1.getName());
			
	}

}
