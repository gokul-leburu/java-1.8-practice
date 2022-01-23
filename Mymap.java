package java_practice;

import java.util.*;

public class Mymap {
	public static void main(String [] args)
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"gokul1");
		map.put(2,"gokul2");
		map.put(3,"gokul3");
		map.put(4,"gokul4");
		map.put(5,"gokul5");
		
		Set<Integer> keys=map.keySet();
		for(int i:keys)
		{
			System.out.println(i);
		}
		//map.containsKey(keys);
		System.out.println(map.containsKey(4));
		//map.isEmpty();
		System.out.println(map.isEmpty()); // returns true when map is empty
		//map.remove(key)
		System.out.println(map.remove(4)); // it return the value of removed key
		System.out.println(map.containsKey(4));
		//map.size()
		System.out.println(map.size());
		
		
		System.out.println(map);
		//map.replace(keys,values)
		map.replace(5, "gokul4");
		System.out.println(map);
	}

}
