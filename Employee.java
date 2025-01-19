package oopsconcept;

public class Employee {
	
	
	int eid;
	String ename;
	String erole;
	
	void display()
	{
		System.out.println("Eid:- "+eid+"  name:- "+ename+"   role:- "+erole);
	}
	
	void setemployeedata(int id,String name,String role)
	{
		eid=id;
		ename=name;
		erole=role;
	}
	
	Employee(int id,String name,String role)
	{
		eid=id;
		ename=name;
		erole=role;
	}
	
	}


