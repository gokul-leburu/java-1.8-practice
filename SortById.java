package java_practice;

import java.util.*;

public class SortById implements Comparator<MyStudent>
{
	@Override
	public int  compare(MyStudent s1,MyStudent s2)
	{
		return s1.getId() - s2.getId();
	}
}

