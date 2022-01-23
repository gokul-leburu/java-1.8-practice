package java_practice;
import java.util.Scanner;
class Employee extends Object
{
	Scanner sc = new Scanner(System.in);
	int employeeID;
	String name;
	public void getemp()
	{
		System.out.println("enter the empid");
		employeeID=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
	}
	@Override
	public String toString()
	{
		return "employeeid = "+employeeID+", name = "+name;
	}
	public void printEmployee()
	{
		System.out.println("employee name "+this.name);
		System.out.println("employee id "+this.employeeID);
	}
	public void search(Employee emp,String name1)
	{
		
	}
}
public class BankApplication {
	public static void main(String [] args) 
	{
		Employee e[]=new Employee[10];
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for append");
	    System.out.println("enter 2 for delete");
	    System.out.println("enter 3 for update");
	    System.out.println("enter 4 for search by name");
	    System.out.println("enter 5 for sorting in acending order");
	    System.out.println("enter 6 for sorting in decending order");
	    System.out.println("enter 7 for exit");
		while(true)
		{
			System.out.println("select ur choice");
		    int choice=sc.nextInt();
		    switch(choice)
		    {
			    case 1:
			    {
			    	e[count]=new Employee();
			    	e[count].getemp();
			    	count++;
			    	break;
			    }
			    case 2:
			    {
			    	System.out.println("enter which employee details need to be deleted");
			    	int empid=sc.nextInt();
			    	for(int i=0;i<count-1;i++)
			    	{
			    		int temp=0;
			    		if(e[i].employeeID==empid || temp==1)
			    		{
			    			e[i]=e[i+1];
			    		}
			    	}
			    	count--;
			    	break;
			    }
			    case 3:
			    {
			    	System.out.println("enter which employee details need to be updated");
			    	int empid=sc.nextInt();
			    	String name=sc.next();
			    	for(int i=0;i<count-1;i++)
			    	{
			    		if(e[i].employeeID==empid)
			    		{
			    			e[i].employeeID=empid;
			    			e[i].name=name;
			    			break;
			    		}
			    	}
			    	break;
			    }
			    case 4:
			    {
			    	System.out.println("enter name to find empid");
			    	String name1 = sc.next();
			    	for(int i=0;i<count;i++)
			    	{
			    		if(name1.equals(e[i].name))
			    		{
			    			System.out.println(e[i].toString());
			    			break;
			    		}
			    	}
			    	break;
			    }
			    case 5:
			    {
			    	for(int i=0;i<count-1;i++) {
						for(int j=0;j<count-i-1;j++) {
							if(e[j].employeeID>e[j+1].employeeID) {
								Employee temp=e[j];
								e[j]=e[j+1];
								e[j+1]=temp;
							}
						}
					}
			    	for(int i=0;i<count;i++)
			    	{
			    		System.out.println(e[i].toString());
			    	}
			    	break;
			    }
			    case 6:
			    {
			    	for(int i=0;i<count-1;i++) {
						for(int j=0;j<count-i-1;j++) {
							if(e[j].employeeID>e[j+1].employeeID) {
								Employee temp=e[j];
								e[j]=e[j+1];
								e[j+1]=temp;
							}
						}
					}
			    	for(int i=count-1;i>=0;i--)
			    	{
			    		System.out.println(e[i].toString());
			    	}
			    	break;
			    }
			    case 7:
			    	for(int i=0;i<count;i++)
			    	{
			    		System.out.println(e[i].toString());
			    	}
			    	break;
			    
		    }
		    if(choice==8)
		    {
		    	break;
		    }
		}
		sc.close();
	}
}
