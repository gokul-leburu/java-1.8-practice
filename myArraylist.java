package java_practice;
import java.util.*;
public class myArraylist {
	public static void main(String[] args) {
		List<MyStudent> lst =new ArrayList<MyStudent>();
		lst.add(new MyStudent(1,"gokul1",23333));
		lst.add(new MyStudent(2,"gokul2",25000));
		lst.add(new MyStudent(3,"gokul3",85000));
		//Collections.sort(lst,new SortByName());
		Collections.sort(lst,Comparator.comparing(MyStudent::getFees));
		for(MyStudent s:lst) 
		{
			System.out.println(s);
		}
	}
}
class MyStudent{
	private int id;
	private String name;
	private int fees;
	@Override
	public String toString() {
		return "Employee [ id :"+this.getId()+" name :"+this.getName()+" fees :"+this.getFees()+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public MyStudent(int id, String name, int fees) 
	{
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	/*@Override
	public int compare(MyStudent o) {
		return Integer.compare(this.getFees(),o.getFees());
		//return Integer.compare(this.getId(),o.getId());
		//return this.getName().compareTo(this.getName());
	}*/
}
