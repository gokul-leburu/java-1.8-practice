package java_practice;

import java.util.Comparator;

public class SortByFee implements Comparator<MyStudent> 
{

	public int compare(MyStudent s1,MyStudent s2)
	{
		return Integer.compare(s1.getFees(),s2.getFees());
	}
}
