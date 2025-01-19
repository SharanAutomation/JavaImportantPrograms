package oopsconcept;

public class StudMain {

	public static void main(String[] args) {
       
		
		
		Stud st1=new Stud();
		st1.setName("Sharan");
		st1.setAddress("Indiranagar");
		st1.setId(123);
		String address=st1.getAddress();
		System.out.println(address);
		int ID=st1.getId();
		System.out.println(ID);
		String name=st1.getName();
		System.out.println(name);
	}

}
